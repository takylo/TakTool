import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Title {
	public Title(){
		
		// on definie les element qu'on va utiliser
		final JFrame title_frame = new JFrame();
		final JPanel title_generator = new JPanel();
		final JButton generate_code = new JButton("Creer le titre");
		final JLabel _id = new JLabel("\n ID :\n");
		final JLabel _name = new JLabel("Titre :");
		final JTextField color_title = new JTextField(5);
		final JLabel _phrase_code_color = new JLabel("Code couleur : \n");
		final JTextField title = new JTextField(8);
		final JTextField id_title = new JTextField(3);
		final JTextField code = new JTextField(25);
        // le panel
		title_generator.setBackground(new Color(161,161,161));
		title_generator.add(Loading.logo_takylo);
		title_generator.add(_id);
		title_generator.add(id_title);
		title_generator.add(_name);
		title_generator.add(title);
		title_generator.add(_phrase_code_color);
		title_generator.add(color_title);
		title_generator.add(generate_code);
		title_generator.add(code);
		// la frame
		title_frame.setSize(370,300);
		title_frame.setResizable(false);
		title_frame.setTitle("Title Generator");
		title_frame.setIconImage(Loading.img.getImage());
		title_frame.add(title_generator);
		title_frame.setVisible(true);

       // la generation du code
		generate_code.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				String name_title = title.getText();
				String id_title_d = id_title.getText();
				String _color = color_title.getText();
				if(name_title.isEmpty() || id_title_d.isEmpty() || _color.isEmpty()){ // on veirfie que tout est bien remplie
					JOptionPane.showMessageDialog(null, "Veuillez remplir tout les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
				}else{	
					code.setText("PT["+id_title_d+"] = {t: '"+name_title+"', c: "+_color+", pt: 0};");
					JOptionPane.showMessageDialog(null, "Votre titre a bien ete generer ! Merci d'utiliser TakTool ", "Info", JOptionPane.INFORMATION_MESSAGE);

				}

			} 
		});
	}
}
