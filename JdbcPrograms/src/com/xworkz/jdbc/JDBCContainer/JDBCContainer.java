package com.xworkz.jdbc.JDBCContainer;

public enum JDBCContainer {
	
	URL("jdbc:mysql://localhost:3306/xworkzbtm"),USERNAME("root"),DONTELL("Mysql@123");
	
	private String container;
	
	private JDBCContainer(String container) {
		this.container=container;
	}
	public String getContainer() {
		return container;
	}
	
	
	

}
