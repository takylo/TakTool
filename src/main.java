import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;




public class main {




	public static void main(String[] args) {



	    final JFrame taktool = new JFrame(); // frame principale
	    final JFrame title_frame = new JFrame(); // title _ frame
	    final JFrame item_creator = new JFrame();
	    final JFrame npc_frame = new JFrame();

	    final JPanel item_creatorp = new JPanel();
	    final JPanel npc_creator = new JPanel();
        // title obj
	    final JPanel title_generator = new JPanel();
	    final JButton generate_code = new JButton("Creer le titre");
	    final JLabel _id = new JLabel("\n ID :\n");
	    final JLabel _name = new JLabel("Titre :");
	    final JLabel _phrase_code_color = new JLabel("Code couleur : \n");
	    final JTextField title = new JTextField(8);
	    final JTextField id_title = new JTextField(3);
	    final JTextField code = new JTextField(25);

	    final JTextField color_title = new JTextField(5);
	    final JLabel image = new JLabel( new ImageIcon( "data/logo.png"));
	    
	    JOptionPane jop1 = new JOptionPane();
        //  end title obj

	    /* code by takylo*/

        // item obj
	    final JTextField _nameItem = new JTextField(25);
	    final JLabel _nameItemj = new JLabel("Nom :");
	    final JLabel _quantite = new JLabel("<html><p style='color:red;'>Nombre</p></html>");
	    final JTextField _inputAddStats = new JTextField(15);
	    final JButton _addStats = new JButton("Ajouter stats");
	    final JTextField sqlCodeItem = new JTextField(25);


        // end
        // img icon
	    final ImageIcon img = new ImageIcon("data/icon.png");
	    final ImageIcon icon_npc = new ImageIcon("data/icone_npc.png");
	    final ImageIcon icon_drop = new ImageIcon("data/icone_ressource.png");
	    final ImageIcon icon_item = new ImageIcon("data/icone_cape.png");
	    final JLabel logo_takylo = new JLabel(new ImageIcon("data/tlogo.png"));

        // end

	    final JComboBox _list = new JComboBox();
	    final JComboBox _itemSelected = new JComboBox();
	    final JComboBox _stats_cat = new JComboBox();
        //  menu obj
	    final JMenuBar menu = new JMenuBar();
	    final JMenu _mtitle = new JMenu("Titre");
	    final JMenu _mdrop = new JMenu("Drop");
	    final JMenu _mitem = new JMenu("Item");
	    final JMenu _mnpc = new JMenu("Npc");
        // end title obj
        // npc
	    final JLabel labelNull = new JLabel("");
	    final JLabel nameNpcLabel = new JLabel("Nom du pnj");
	    final JLabel idNpcLabel = new JLabel("ID du pnj");
	    final JLabel sizeNpcLabel = new JLabel("Size");
	    final JLabel gfxIdNpcLabel = new JLabel("gfx ID");
	    final JLabel itemPnjLabel = new JLabel("ID des item que vendra le pnj");
	    final JButton create_npc = new JButton("Creer le pnj");

	    final JTextField nameNpc = new JTextField(1); // nom du pnj
	    final JTextField idNpc = new JTextField(1); // son id
	    final JTextField sizeNpc = new JTextField(1); // size
	    final JTextField gfxIdNpc = new JTextField(1);
	    final JTextField itemPnj = new JTextField(1);
	    final JTextField finalCodeNpc = new JTextField(30);
        // end npc


	    final ImageIcon cc = new ImageIcon("data/Elements/cc.png");
           // end 
           // do
	    final ImageIcon dTerre = new ImageIcon("data/item/Elements/dTerre.png");
	    final ImageIcon dEau = new ImageIcon("data/item/Elements/dEau.png");
	    final ImageIcon dFeu = new ImageIcon("data/item/Elements/dFeu.png");
	    final ImageIcon dNeutre = new ImageIcon("data/item/Elements/dNeutre.png");
	    final ImageIcon dAir = new ImageIcon("data/item/Elements/dAir.png");
	    final ImageIcon dmg = new ImageIcon("data/item/Elements/dmg.png");
           // end 
           // esquive
	    final ImageIcon esqPa = new ImageIcon("data/item/Elements/esqPa.png");
	    final ImageIcon esqPm = new ImageIcon("data/item/Elements/esqPm.png");
           // end

           // stats
	    final ImageIcon air = new ImageIcon("data/item/Elements/air.png");
	    final ImageIcon feu = new ImageIcon("data/item/Elements/feu.png");
	    final ImageIcon terre = new ImageIcon("data/item/Elements/terre.png");
	    final ImageIcon neutre = new ImageIcon("data/item/Elements/neutre.png");
	    final ImageIcon vita = new ImageIcon("data/item/Elements/vita.png");
	    final ImageIcon sage = new ImageIcon("data/item/Elements/sage.png");
           //end
           // res
	    final ImageIcon resAir = new ImageIcon("data/item/Elements/resistance_air.png");
	    final ImageIcon resTerre = new ImageIcon("data/item/Elements/resistance_terre.png");
	    final ImageIcon resEau = new ImageIcon("data/item/Elements/resistance_eau.png");
	    final ImageIcon resFeu = new ImageIcon("data/item/Elements/resistance_feu.png");
	    final ImageIcon resNeutre = new ImageIcon("data/item/Elements/resistance_neutre.png");
           // end
           // other
	    final ImageIcon invok = new ImageIcon("data/item/Elements/invok.png");
	    final ImageIcon po = new ImageIcon("data/item/Elements/po.png");
	    final ImageIcon pod = new ImageIcon("data/item/Elements/pod.png");
	    final ImageIcon ini = new ImageIcon("data/item/Elements/initiative.png");
	    final ImageIcon pa = new ImageIcon("data/item/Elements/pa.png"); 
	    final ImageIcon pm = new ImageIcon("data/item/Elements/pm.png"); 


	    taktool.setJMenuBar(menu);
	    _mdrop.setIcon(icon_drop);
	    _mitem.setIcon(icon_item);
	    _mnpc.setIcon(icon_npc);
	    menu.add(_mtitle);
	    menu.add(_mdrop);
	    menu.add(_mitem);
	    menu.add(_mnpc);
        //  end


	    /* NPC CREATOR*/
	    npc_creator.setLayout(new GridLayout(8,2));

	    npc_creator.add(nameNpcLabel);
	    npc_creator.add(nameNpc);

	    npc_creator.add(gfxIdNpcLabel);
	    npc_creator.add(gfxIdNpc);

	    npc_creator.add(idNpcLabel);
	    npc_creator.add(idNpc);

	    npc_creator.add(sizeNpcLabel);
	    npc_creator.add(sizeNpc);

	    npc_creator.add(itemPnjLabel);
	    npc_creator.add(itemPnj);

	    npc_creator.add(labelNull);
	    npc_creator.add(create_npc);


	    /* ITEM GENERATOR -- LISTAGE DES ITEM */
	    _list.addItem("Coiffe");
	    _list.addItem("Cape");
	    _list.addItem("Amulette");
	    _list.addItem("Botte");
	    _list.addItem("Ceinture");
	    _list.addItem("Familier");
	    _list.addItem("Dofus");
	    _list.addItem("Epee");
	    _list.addItem("Dague");
	    _list.addItem("Marteau");
	    _list.addItem("Hache");
	    _list.addItem("Baton");
	    _list.addItem("Baguette");
	    _list.addItem("Pelle");
	    _list.addItem("Faux");

	    /* STATS */
           // cc

           // end
	    /* END STATS*/
        /* ON ADD LES STATS DANS LE JCOMBOBOX*/ // attention les yeux sapik * jeux de mot hehe *
        _stats_cat.addItem(cc);
        _stats_cat.addItem(dTerre);
        _stats_cat.addItem(dEau);
        _stats_cat.addItem(dFeu);
        _stats_cat.addItem(dNeutre);
        _stats_cat.addItem(dAir);
        _stats_cat.addItem(dmg);
        _stats_cat.addItem(esqPm);
        _stats_cat.addItem(esqPa);
        _stats_cat.addItem(air);
        _stats_cat.addItem(feu);
        _stats_cat.addItem(terre);
        _stats_cat.addItem(vita);
        _stats_cat.addItem(sage);
        _stats_cat.addItem(resAir);
        _stats_cat.addItem(resFeu);
        _stats_cat.addItem(resTerre);
        _stats_cat.addItem(resNeutre);
        _stats_cat.addItem(invok);
        _stats_cat.addItem(po);
        _stats_cat.addItem(pod);
        _stats_cat.addItem(ini);
        _stats_cat.addItem(pa);
        _stats_cat.addItem(pm);
        // end add stats to jcombo


/*Attention a vos yeux le code qui va suivre est douloureux , en gros ya une 'case' pour chaque choix de type
 d'item possible le switch est enorme mais bon on est des pgm <3

Code by takylo - Tool creer pour King-Emu - http://www.king-emu.com
*/


_list.addActionListener(new ActionListener() { 
	public void actionPerformed(ActionEvent args0) {
		switch(_list.getSelectedItem().toString()){
			case "Amulette":
			_itemSelected.removeAllItems();
			int ia = 0;
			while(ia != 158){
				ImageIcon item_listage = new ImageIcon("data/item/1/"+ia+" (Copier).png");
				ia++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Arc":
			_itemSelected.removeAllItems();
			int ib = 0;
			while(ib != 69){

				ImageIcon item_listage = new ImageIcon("data/item/2/"+ib+".png");
				ib++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Baguette":
			_itemSelected.removeAllItems();

			int ic = 0;
			while(ic != 74){
				ImageIcon item_listage = new ImageIcon("data/item/3/"+ic+".png");
				ic++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Baton":
			_itemSelected.removeAllItems();

			int id = 0;
			while(id != 92){
				ImageIcon item_listage = new ImageIcon("data/item/4/"+id+".png");
				id++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Dague":
			_itemSelected.removeAllItems();

			int bp = 0;
			while(bp != 77){
				ImageIcon item_listage = new ImageIcon("data/item/5/"+bp+".png");
				bp++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Epee":
			_itemSelected.removeAllItems();

			int ie = 0;
			while(ie != 97){
				ImageIcon item_listage = new ImageIcon("data/item/6/"+ie+".png");
				ie++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Marteau":
			_itemSelected.removeAllItems();

			int ig = 0;
			while(ig != 74){
				ImageIcon item_listage = new ImageIcon("data/item/7/"+ig+".png");
				ig++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;	
			case "Pelle":
			_itemSelected.removeAllItems();

			int ifs = 0;
			while(ifs != 57){
				ImageIcon item_listage = new ImageIcon("data/item/8/"+ifs+".png");
				ifs++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Anneau":
			_itemSelected.removeAllItems();

			int gp = 0;
			while(gp != 185){
				ImageIcon item_listage = new ImageIcon("data/item/9/"+gp+".png");
				gp++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Ceinture":
			_itemSelected.removeAllItems();

			int ih = 0;
			while(ih != 170){
				ImageIcon item_listage = new ImageIcon("data/item/10/"+ih+".png");
				ih++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Botte":
			_itemSelected.removeAllItems();

			int gjh = 0;
			while(gjh != 153){
				ImageIcon item_listage = new ImageIcon("data/item/11/"+gjh+".png");
				gjh++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Coiffe":
			_itemSelected.removeAllItems();

			int bgfd = 0;
			while(bgfd != 257){
				ImageIcon item_listage = new ImageIcon("data/item/16/"+bgfd+".png");
				bgfd++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Cape":
			_itemSelected.removeAllItems();

			int pdm = 0;
			while(pdm != 174){
				ImageIcon item_listage = new ImageIcon("data/item/17/"+pdm+".png");
				pdm++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Familier":
			_itemSelected.removeAllItems();

			int dedianext = 0;
			while(dedianext != 62){
				ImageIcon item_listage = new ImageIcon("data/item/18/"+dedianext+".png");
				dedianext++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Hache":
			_itemSelected.removeAllItems();

			int radiusjtm = 0;
			while(radiusjtm != 59){
				ImageIcon item_listage = new ImageIcon("data/item/19/"+radiusjtm+".png");
				radiusjtm++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Faux":
			_itemSelected.removeAllItems();

			int bytakyloplzdontrnamethistoolilovenameofvariabletrolo = 0;
			while(bytakyloplzdontrnamethistoolilovenameofvariabletrolo != 4){
				ImageIcon item_listage = new ImageIcon("data/item/22/"+bytakyloplzdontrnamethistoolilovenameofvariabletrolo+".png");
				bytakyloplzdontrnamethistoolilovenameofvariabletrolo++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			case "Dofus":
			_itemSelected.removeAllItems();

			int tkylod = 0;
			while(tkylod != 4){
				ImageIcon item_listage = new ImageIcon("data/item/23/"+tkylod+".png");
				tkylod++; 
	    				//_itemSelected.removeItem(item_listage);
				_itemSelected.addItem(item_listage);
	    				//item_creatorp.add(_itemSelected);

			}
			break;
			default:
			JOptionPane.showMessageDialog(null, "Erreur Inconnu . Veuillez me contactez [Skype:Takylo91]" , "Erreur", JOptionPane.ERROR_MESSAGE);

			break;
		}
	}
});





/* END ITEM GENERATOR || CODE BY TAKYLO  */

        // add des obj pour item creator
item_creatorp.setBackground(new Color(161,161,161));
item_creatorp.add(logo_takylo);
item_creatorp.add(_list);
item_creatorp.add(_itemSelected);
item_creatorp.add(_stats_cat);
item_creatorp.add(_nameItemj);
item_creatorp.add(_nameItem);

item_creatorp.add(_inputAddStats);
item_creatorp.add(_addStats);

        // end
/* code by takylo ( oui c'est moche comme code et alors ? ok je sort je parle tout seul :( )  */
	/* ON ADD LES OBJ POUR LE NPC CREATOR */

        // on add les obj pour le title tool
	title_generator.setBackground(new Color(161,161,161));
	title_generator.add(logo_takylo);
	title_generator.add(_id);
	title_generator.add(id_title);
	title_generator.add(_name);
	title_generator.add(title);
	title_generator.add(_phrase_code_color);
	title_generator.add(color_title);
	title_generator.add(generate_code);
	title_generator.add(code);

        // end


        // fenetre
	taktool.setVisible(true);
	taktool.setSize(370,300);
	taktool.setResizable(false);
	taktool.setTitle("TakTool [Takylo]");
	taktool.add(image);
	taktool.setIconImage(img.getImage());
	taktool.setLocationRelativeTo(null);
	taktool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // fin fenetre


   // on change le look and feel 
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		SwingUtilities.updateComponentTreeUI(taktool);
	} catch (Exception e1) {
		JOptionPane.showMessageDialog(null, "Probleme d'interface graphique", "ERREUR", JOptionPane.WARNING_MESSAGE);

	}

	/* ACTION SUR LE MENU*/

	_mtitle.addMenuListener(  
		new MenuListener() {  
			public void menuSelected(MenuEvent e) {  
	    			// si il clique sur le jmenu _mtitle on creer & on add la frame title generator
				title_frame.setSize(370,300);
				title_frame.setResizable(false);
				title_frame.setTitle("Title Generator ");
				title_frame.setIconImage(img.getImage());
				title_frame.add(title_generator);
				title_frame.setVisible(true);
			}  

			public void menuDeselected(MenuEvent e) {}  
			public void menuCanceled(MenuEvent e) {}  
		}  
		);  

	_mnpc.addMenuListener(  
		new MenuListener() {  
			public void menuSelected(MenuEvent e) {  
				
				npc_frame.setSize(500,300);
				npc_frame.setResizable(false);
				npc_frame.setTitle("NPC Generator ");
				npc_frame.setIconImage(img.getImage());
				npc_frame.add(npc_creator);
				npc_frame.setVisible(true);
			}  

			public void menuDeselected(MenuEvent e) {}  
			public void menuCanceled(MenuEvent e) {}  
		}  
		);  
	_mitem.addMenuListener(  
		new MenuListener() {  
			public void menuSelected(MenuEvent e) {  
	    			// si il clique sur le jmenu _mitem on creer & on add la frame item generator
				item_creator.setSize(900,500);
				item_creator.setResizable(false);
				item_creator.setTitle("Item Generator");
				item_creator.setIconImage(img.getImage());
				item_creator.add(item_creatorp);
				item_creator.setVisible(true);
				JOptionPane.showMessageDialog(null, "L'item Generator n'est pas encore disponible :( ", "Info", JOptionPane.INFORMATION_MESSAGE);

			}  

			public void menuDeselected(MenuEvent e) {}  
			public void menuCanceled(MenuEvent e) {}  
		}  
		);  


        // ACTION LISTENER
	generate_code.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent e) { 
			String name_title = title.getText();
			String id_title_d = id_title.getText();
			String _color = color_title.getText();
			if(name_title.isEmpty() || id_title_d.isEmpty() || _color.isEmpty()){
				JOptionPane.showMessageDialog(null, "Veuillez remplir tout les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
			}else{	
				code.setText("PT["+id_title_d+"] = {t: '"+name_title+"', c: "+_color+", pt: 0};");
				JOptionPane.showMessageDialog(null, "Votre titre a bien ete generer ! Merci d'utiliser TakTool ", "Info", JOptionPane.INFORMATION_MESSAGE);

			}

		} 
	});
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
				writeFile(""+nameNpc_+"[sql].sql",""+geneateCode_+"");
				writeFile(""+nameNpc_+"[swf].txt",""+geneateCodeSwf_+"");
				JOptionPane.showMessageDialog(null , "Votre fichier sql et swf on ete generer dans le dossier /_generate ! N'oubliez pas de copier le .txt dans npc_fr_494.swf ! Pour ajouter sur le pnj in game tapez la commande \n addnpc "+idNpc_+"" , "Info" , JOptionPane.INFORMATION_MESSAGE);	
			}
		}
	});
// add stats
String dTerre_s = null;
_addStats.addActionListener(new ActionListener() { 
	public void actionPerformed(ActionEvent args0) { 
		String id_catElement = _stats_cat.getSelectedItem().toString();
		String nbrStats = _inputAddStats.getText();
		switch(_stats_cat.getSelectedItem().toString()){
            //  data/item/Elements/   

			case "data/item/Elements/dTerre.png": /* dommage terre*/
                 // 61
			String dTerre_s = "dTerre";
			sqlCodeItem.setText(dTerre_s);
			break; 
			case "data/item/Elements/dEau.png": /* dommage eau */
                 // 60
			break;
			case "data/item/Elements/dFeu.png": /* dommage feu*/
                 // 63
			break; 
			case "data/item/Elements/dAir.png": /* dommage air*/
                 // 62
			break;
			case "data/item/Elements/dNeutre.png": /* dommage neutre*/
                 // 64
			break; 
			case "data/item/Elements/dmg.png": /* dommage*/
                 // 79
			break;
			case "data/item/Elements/esqPm.png": /* esquive pm*/
			System.out.print("esqPm");
			break; 
			case "data/item/Elements/esqPa.png": /* esquive pm*/
			System.out.print("esqPa");
			break;
			case "data/item/Elements/air.png": /* agilite*/
                 // 77
			break; 
			case "data/item/Elements/feu.png": /* intel */
                 // 7e
			break;
			case "data/item/Elements/eau.png": /* chance */
                 // 7b
			break;  
			case "data/item/Elements/terre.png": /* force*/
                 // 76
     		break;
			case "data/item/Elements/vita.png": /* vita */
                 // 7d
			break;
			case "data/item/Elements/neutre.png": /*  neutre ?  */
			System.out.print("neutre");
			break;
			case "data/item/Elements/pa.png": /* pa */
                 // 6f
			break; 
			case "data/item/Elements/pm.png": /* pm */
                 // 80
			break;
			case "data/item/Elements/sage.png": /* sagesse */
                 // 7d
			break;
			case "data/item/Elements/pod.png": /* pod */
                 // 9e
			break; 
			case "data/item/Elements/initiative.png": /* initiative*/
                 // ae
			break;
			case "data/item/Elements/po.png": /* portee*/
                 // 75
			break; 
			case "data/item/Elements/resistance_air.png": /* res air */
			System.out.print("resistance_air");
			break;
			case "data/item/Elements/resistance_neutre.png": /* res neutre */
			System.out.print("resistance_neutre");
			break; 
			case "data/item/Elements/resistance_feu.png": /*res feu*/
			System.out.print("resistance_feu");
			break;
			case "data/item/Elements/resistance_terre.png": /* res terre*/
			System.out.print("resistance_terre");
			break; 
			case "data/item/Elements/resistance_eau.png": /*res eau*/
			System.out.print("resistance_eau");
			break;
			case "data/item/Elements/invok.png": /* invocation */
                 // b6
			break;
		}
	} 
});

String a = "ee";
sqlCodeItem.setText(a);
item_creatorp.add(sqlCodeItem);
// end
}
public static void createFile(String name,String extension,String type){
	try 
	{ 
		File fichier = new File("_generate/"+name+" - ["+type+"]."+extension+""); 
      fichier.createNewFile(); // Cette fonction doit être appelée au sein d'un bloc TRY 
  } 
  catch (Exception e) 
  { 
  	JOptionPane.showMessageDialog(null, "Impossible de creer un fichier dans /_generate/", "ERREUR", JOptionPane.INFORMATION_MESSAGE);
  } 
}
public static void writeFile(String filename,String txt){

	File file = new File("_generate/"+filename+"");

	try {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(txt);
		bw.close();
	} catch (Exception e) {
				// TODO Auto-generated catch block
		JOptionPane.showMessageDialog(null, "Impossible d'ecrire dans le fichier  /_generate/"+filename+"", "ERREUR", JOptionPane.INFORMATION_MESSAGE);
	}
}


}