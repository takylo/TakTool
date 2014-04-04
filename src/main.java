import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class main {

	public static void main(String[] args) {

	    final JFrame taktool = new JFrame(); // frame principale
	    final JMenuBar menu = new JMenuBar();
	    final JMenu _mtitle = new JMenu("Titre");
	    final JMenu _mdrop = new JMenu("Drop");
	    final JMenu _mitem = new JMenu("Item");
	    final JMenu _mnpc = new JMenu("Npc");
	    final JMenu _mmob = new JMenu("Mob");

        // on set le jmenubar
	    taktool.setJMenuBar(menu);
	    // on set les icon du menu
	    _mdrop.setIcon(Loading.icon_drop);
	    _mitem.setIcon(Loading.icon_item);
	    _mnpc.setIcon(Loading.icon_npc);
	    _mmob.setIcon(Loading.icon_mob);
	    // on add le menu
	    menu.add(_mtitle);
	    menu.add(_mdrop);
	    menu.add(_mitem);
	    menu.add(_mnpc);
	    menu.add(_mmob);

// fenetre
	    taktool.setVisible(true);
	    taktool.setSize(370,300);
	    taktool.setResizable(false);
	    taktool.setTitle("TakTool [Takylo]");
	    taktool.add(Loading.image);
	    taktool.setIconImage(Loading.img.getImage());
	    taktool.setLocationRelativeTo(null);
	    taktool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(taktool);
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Probleme d'interface graphique", "ERREUR", JOptionPane.WARNING_MESSAGE);

		}
//  si il clique sur le bouton title du menu
	    _mtitle.addMenuListener(  
	    	new MenuListener() {  
	    		public void menuSelected(MenuEvent e) {  
	    			Title title = new Title();
	    		}  

	    		public void menuDeselected(MenuEvent e) {}  
	    		public void menuCanceled(MenuEvent e) {}  
	    	}  
	    	);  
//  si il clique sur le bouton npc du menu
	    _mnpc.addMenuListener(  
	    	new MenuListener() {  
	    		public void menuSelected(MenuEvent e) {  
	    			Npc npc = new Npc();
	    		}  
	    		public void menuDeselected(MenuEvent e) {}  
	    		public void menuCanceled(MenuEvent e) {}  
	    	}  
	    	); 
//  si il clique sur le bouton item du menu
	    _mitem.addMenuListener(  
	    	new MenuListener() {  
	    		public void menuSelected(MenuEvent e) {  
	    			Item item = new Item();
	    		}  
	    		public void menuDeselected(MenuEvent e) {}  
	    		public void menuCanceled(MenuEvent e) {}  
	    	}  
	    	);  
//  si il clique sur le bouton mob du menu
	    _mmob.addMenuListener(  
	    	new MenuListener() {  
	    		public void menuSelected(MenuEvent e) {  
	    			Mob mob = new Mob();
	    		}  
	    		public void menuDeselected(MenuEvent e) {}  
	    		public void menuCanceled(MenuEvent e) {}  
	    	}  
	    	);  
	}
	public static void writeFile(String filename,String txt){
		File file = new File("_generate/"+filename+"");
		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(txt);
			bw.close();
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Impossible d'ecrire dans le fichier  /_generate/"+filename+"", "ERREUR", JOptionPane.INFORMATION_MESSAGE);
		}
	}


}