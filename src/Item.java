import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Item {
	public Item(){
		// on definie les element qu'on va utiliser
		final JFrame item_creator = new JFrame();   
		final JPanel item_creatorp = new JPanel();
		final JTextField _nameItem = new JTextField(25);
		final JLabel _nameItemj = new JLabel("Nom :");
		final JLabel _quantite = new JLabel("<html><p style='color:red;'>Nombre</p></html>");
		final JTextField _inputAddStats = new JTextField(15);
		final JButton _addStats = new JButton("Ajouter stats");
		final JTextField sqlCodeItem = new JTextField(25);
		final JComboBox _list = new JComboBox();
		final JComboBox _itemSelected = new JComboBox();
		final JComboBox _stats_cat = new JComboBox();
		// les categorie d'item

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
        //  la list des stats
		_stats_cat.addItem(Loading.cc);
		_stats_cat.addItem(Loading.dTerre);
		_stats_cat.addItem(Loading.dEau);
		_stats_cat.addItem(Loading.dFeu);
		_stats_cat.addItem(Loading.dNeutre);
		_stats_cat.addItem(Loading.dAir);
		_stats_cat.addItem(Loading.dmg);
		_stats_cat.addItem(Loading.esqPm);
		_stats_cat.addItem(Loading.esqPa);
		_stats_cat.addItem(Loading.air);
		_stats_cat.addItem(Loading.feu);
		_stats_cat.addItem(Loading.terre);
		_stats_cat.addItem(Loading.vita);
		_stats_cat.addItem(Loading.sage);
		_stats_cat.addItem(Loading.resAir);
		_stats_cat.addItem(Loading.resFeu);
		_stats_cat.addItem(Loading.resTerre);
		_stats_cat.addItem(Loading.resNeutre);
		_stats_cat.addItem(Loading.invok);
		_stats_cat.addItem(Loading.po);
		_stats_cat.addItem(Loading.pod);
		_stats_cat.addItem(Loading.ini);
		_stats_cat.addItem(Loading.pa);
		_stats_cat.addItem(Loading.pm);
        // le panel
		item_creatorp.setBackground(new Color(161,161,161));
		item_creatorp.add(_list);
		item_creatorp.add(_itemSelected);
		item_creatorp.add(_stats_cat);
		item_creatorp.add(_nameItemj);
		item_creatorp.add(_nameItem);
		item_creatorp.add(_inputAddStats);
		item_creatorp.add(_addStats);
		// la frame
		item_creator.setSize(900,500);
		item_creator.setResizable(false);
		item_creator.setTitle("Item Generator");
		item_creator.setIconImage(Loading.img.getImage());
		item_creator.add(item_creatorp);
		item_creator.setVisible(true);
		JOptionPane.showMessageDialog(null, "L'item Generator n'est pas encore disponible :( ", "Info", JOptionPane.INFORMATION_MESSAGE);

         // le switch pour les item

			_list.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent args0) {
					switch(_list.getSelectedItem().toString()){
						case "Amulette":
						_itemSelected.removeAllItems();
						int a = 0;
						while(a != 158){
							ImageIcon item_listage = new ImageIcon("data/item/1/"+a+" (Copier).png");
							a++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Arc":
						_itemSelected.removeAllItems();
						int b = 0;
						while(b != 69){
							ImageIcon item_listage = new ImageIcon("data/item/2/"+b+".png");
							b++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Baguette":
						_itemSelected.removeAllItems();
						int c = 0;
						while(c != 74){
							ImageIcon item_listage = new ImageIcon("data/item/3/"+c+".png");
							c++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Baton":
						_itemSelected.removeAllItems();
						int d = 0;
						while(d != 92){
							ImageIcon item_listage = new ImageIcon("data/item/4/"+d+".png");
							d++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Dague":
						_itemSelected.removeAllItems();
						int e = 0;
						while(e != 77){
							ImageIcon item_listage = new ImageIcon("data/item/5/"+e+".png");
							e++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Epee":
						_itemSelected.removeAllItems();
						int f = 0;
						while(f != 97){
							ImageIcon item_listage = new ImageIcon("data/item/6/"+f+".png");
							f++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Marteau":
						_itemSelected.removeAllItems();
						int g = 0;
						while(g != 74){
							ImageIcon item_listage = new ImageIcon("data/item/7/"+g+".png");
							g++; 
							_itemSelected.addItem(item_listage);
						}
						break;	
						case "Pelle":
						_itemSelected.removeAllItems();
						int h = 0;
						while(h != 57){
							ImageIcon item_listage = new ImageIcon("data/item/8/"+h+".png");
							h++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Anneau":
						_itemSelected.removeAllItems();
						int i = 0;
						while(i != 185){
							ImageIcon item_listage = new ImageIcon("data/item/9/"+i+".png");
							i++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Ceinture":
						_itemSelected.removeAllItems();
						int j = 0;
						while(j != 170){
							ImageIcon item_listage = new ImageIcon("data/item/10/"+j+".png");
							j++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Botte":
						_itemSelected.removeAllItems();
						int k = 0;
						while(k != 153){
							ImageIcon item_listage = new ImageIcon("data/item/11/"+k+".png");
							k++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Coiffe":
						_itemSelected.removeAllItems();
						int l = 0;
						while(l != 257){
							ImageIcon item_listage = new ImageIcon("data/item/16/"+l+".png");
							l++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Cape":
						_itemSelected.removeAllItems();
						int m = 0;
						while(m != 174){
							ImageIcon item_listage = new ImageIcon("data/item/17/"+m+".png");
							m++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Familier":
						_itemSelected.removeAllItems();
						int n = 0;
						while(n != 62){
							ImageIcon item_listage = new ImageIcon("data/item/18/"+n+".png");
							n++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Hache":
						_itemSelected.removeAllItems();
						int o = 0;
						while(o != 59){
							ImageIcon item_listage = new ImageIcon("data/item/19/"+o+".png");
							o++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Faux":
						_itemSelected.removeAllItems();
						int p = 0;
						while(p != 4){
							ImageIcon item_listage = new ImageIcon("data/item/22/"+p+".png");
							p++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						case "Dofus":
						_itemSelected.removeAllItems();
						int q = 0;
						while(q != 4){
							ImageIcon item_listage = new ImageIcon("data/item/23/"+q+".png");
							q++; 
							_itemSelected.addItem(item_listage);
						}
						break;
						default:
						JOptionPane.showMessageDialog(null, "Erreur Inconnu . Veuillez me contactez [Skype:Takylo91]" , "Erreur", JOptionPane.ERROR_MESSAGE);

						break;
					}
				}
			});
         // le switch du choix de la stats
_addStats.addActionListener(new ActionListener() { 
	public void actionPerformed(ActionEvent args0) { 
		String id_catElement = _stats_cat.getSelectedItem().toString();
		String nbrStats = _inputAddStats.getText();
		switch(_stats_cat.getSelectedItem().toString()){
			case "data/item/Elements/dTerre.png": /* dommage terre*/
                 // 61
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
			     // --
			break; 
			case "data/item/Elements/esqPa.png": /* esquive pm*/
			     // --
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
			     // --
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
                 // --
			break;
			case "data/item/Elements/resistance_neutre.png": /* res neutre */
                 // --
			break; 
			case "data/item/Elements/resistance_feu.png": /*res feu*/
                 // --
			break;
			case "data/item/Elements/resistance_terre.png": /* res terre*/
                 // --
			break; 
			case "data/item/Elements/resistance_eau.png": /*res eau*/
			    // --
			break;
			case "data/item/Elements/invok.png": /* invocation */
                // b6
			break;
		}
	} 
});
}
}
