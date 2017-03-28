import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SelectBus extends JPanel{
	public SelectBus(){
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
		DB db=new DB();
		try {
			DefaultTableModel dtm = new DefaultTableModel(new String[]{"차량번호", "출발지", "도착지", "첫차시간","소요시간","움임횟수","운임금액"}, 0);
			JTable table=new JTable(dtm);
			ResultSet rs = db.stmt.executeQuery("SELECT * FROM sw3_01.tbl_bus;");
			while(rs.next()){
				dtm.addRow(new Object[]{rs.getString("bNumber"), rs.getString("bDeparture"), rs.getString("bArrival"), rs.getString("bTime"), rs.getString("bElapse"), rs.getString("bCount"), rs.getString("bPrice")});
			}
			JScrollPane sp = new JScrollPane(table);
			sp.setPreferredSize(new Dimension(700, 400));
			table.setRowHeight(25);
			
			add(sp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
