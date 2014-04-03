import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// NPC GENERATOR

public class Npc {
	public Npc(){

		// on definie les element qu'on va utiliser
		final JFrame npc_frame = new JFrame();
		final JPanel npc_creator = new JPanel();
		final JLabel labelNull = new JLabel("");
		final JLabel nameNpcLabel = new JLabel("Nom du pnj");
		final JLabel idNpcLabel = new JLabel("ID du pnj");
		final JLabel sizeNpcLabel = new JLabel("Size");
		final JLabel gfxIdNpcLabel = new JLabel("gfx ID");
		final JLabel itemPnjLabel = new JLabel("ID des item que vendra le pnj");
		final JButton create_npc = new JButton("Creer le pnj");
		final JTextField nameNpc = new JTextField(1);
		final JTextField idNpc = new JTextField(1);
		final JTextField sizeNpc = new JTextField(1);
		final JTextField gfxIdNpc = new JTextField(1);
		final JTextField itemPnj = new JTextField(1);
		final JTextField finalCodeNpc = new JTextField(30);


        // on set un GridLayor
		npc_creator.setLayout(new GridLayout(8,2));
        // nom du npc
		npc_creator.add(nameNpcLabel);
		npc_creator.add(nameNpc);
        // gfx id
		npc_creator.add(gfxIdNpcLabel);
		npc_creator.add(gfxIdNpc);
        // id
		npc_creator.add(idNpcLabel);
		npc_creator.add(idNpc);
        // taille
		npc_creator.add(sizeNpcLabel);
		npc_creator.add(sizeNpc);
        // item en vente
		npc_creator.add(itemPnjLabel);
		npc_creator.add(itemPnj);
        // boutton pour le creer
		npc_creator.add(labelNull);
		npc_creator.add(create_npc);

		npc_frame.setSize(500,300);
		npc_frame.setResizable(false);
		npc_frame.setTitle("NPC Generator ");
		npc_frame.setIconImage(Loading.img.getImage());
		npc_frame.add(npc_creator);
		npc_frame.setVisible(true);
		

		create_npc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String nameNpc_ = nameNpc.getText();
				String idNpc_ = idNpc.getText();
				String sizeNpc_ = sizeNpc.getText();
				String itemPnj_ = itemPnj.getText();
				String gfxIdNpc_ = gfxIdNpc.getText();
				if(nameNpc_.isEmpty() || idNpc_.isEmpty()  || sizeNpc_.isEmpty() || itemPnj_.isEmpty() || gfxIdNpc_.isEmpty()){
					JOptionPane.showMessageDialog(null, "Veuillez remplir tout les champs", "Erreur", JOptionPane.ERROR_MESSAGE);

				}else{
					String geneateCodeSwf_ = "N.d["+idNpc_+"] = {n: \""+nameNpc_+"\", a: [3, 5, 6]};";
					String geneateCode_ = "INSERT INTO `npc_template` VALUES ('"+idNpc_+"', '0', '"+gfxIdNpc_+"', '100', '"+sizeNpc_+"', '0', '-1', '-1', '-1', '0,0,0,0', '-1', '0', '-1', '"+itemPnj_+"');";
					main.writeFile(""+nameNpc_+"[sql].sql",""+geneateCode_+"");
					main.writeFile(""+nameNpc_+"[swf].txt",""+geneateCodeSwf_+"");
					JOptionPane.showMessageDialog(null , "Votre fichier sql et swf on ete generer dans le dossier /_generate ! N'oubliez pas de copier le .txt dans npc_fr_494.swf ! Pour ajouter sur le pnj in game tapez la commande \n addnpc "+idNpc_+"" , "Info" , JOptionPane.INFORMATION_MESSAGE);	
				}
			}
		});
     }
}
