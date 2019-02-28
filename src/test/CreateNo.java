package test;

import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class CreateNo {

	public static void main(String[] args) {

		String result = "";
		String operateType = getParameter(request,"operateType");
		
		if("newsNo".equals(operateType)) {
			result = getnewNo(request); 
		}
		
		out.clear();
		out.print(result);
		System.out.println();
	}
	
	
String getnewsNo(HttpServletRequest request)throws Exception{
	String newsYear = request.getParameter(request,"newYear");
	String sql = "select * from GA_NEWSISSUANCE where newsNo like '" +newsYear+"%' order by newsNo desc";
	// String sql = "insert into student values ( " + student.getId() + " ,' " + student.getUsername() + " ',  " + student.getAge() + " ,' " + student.getClassnumber()+" ')";
    String datasourceId = "workflow_data";
    //jdbcOperation
    WFHDBCOperation jdbcOperation = WFSessionImpl.getTDBCOperation(datasourceId);
    DBResult getNewsNo = jdbcOperation.getResultSet(sql);
    
    String num = "-1";
    List<String> newsNolist = new ArrayList<String>();
    while(getNewsNo.next()) {
    	num = getNewsNO.getString("newsNo");
    	newsNolist.add(num);
    }
    
    if(newsNoList.size()>0) {
    	num = newsNoList.get(0);
    	num = num.substring(4, 8);
    	num =String.valueOf(Integer.parseInt(num)+1);//µÈ¼ÛÓÚ  num = Integer.parseInt(num)+1+"";
    	
    }
    
    return num;
    
}

}
