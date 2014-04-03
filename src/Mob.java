import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Mob {
	public Mob(){

		final JFrame mob_frame = new JFrame();
		final JPanel mob_creator = new JPanel();
         
        final JTextField name = new JTextField(1);
        final JLabel name_t = new JLabel("Nom");
        final JTextField gfxid = new JTextField(1);
        final JLabel gfxid_t = new JLabel("gfx ID");
        final JTextField id = new JTextField(1);
        final JLabel id_t = new JLabel("ID");
        final JComboBox is_capturable = new JComboBox();
        final JLabel is_capturable_t = new JLabel("Capturable ?");
        
        is_capturable.addItem("Oui");
        is_capturable.addItem("Non");
        // le panel
		mob_creator.setLayout(new GridLayout(4,2));
        mob_creator.add(name_t); mob_creator.add(name);
        mob_creator.add(id_t);mob_creator.add(id);
        mob_creator.add(gfxid_t);mob_creator.add(gfxid);
        mob_creator.add(is_capturable_t);mob_creator.add(is_capturable);
        // la frame
		mob_frame.setTitle("Createur de monstres");
		mob_frame.setSize(500,300);
		mob_frame.setResizable(false);
		mob_frame.setIconImage(Loading.img.getImage());
		mob_frame.add(mob_creator);
		mob_frame.setVisible(true);

// INSERT INTO `monsters` VALUES 
// ('<id>', '<name>', '<gfxid>', '-1', '2@1;5;5;-9;-9;5;3|3@2;6;6;-8;-8;6;4|4@3;7;7;-7;-7;7;5|5@4;8;8;-6;-6;8;6|6@5;9;9;-5;-5;9;7|1@', '-1,-1,-1', '80,0,80,80,0|85,0,85,85,0|90,0,90,90,0|95,0,95,95,0|100,0,100,100,0|120,0,110,120,0', '213@1;212@1|213@2;212@2|213@3;212@3|213@4;212@4|213@5;212@5|', '10|15|20|25|30|1', '4;2|4;2|4;2|4;2|4;2|1;1', '1|1|1|1|1|1', '<minK>', '<maxK>', '3|7|12|18|26|1', '1', '1');

	}
}
