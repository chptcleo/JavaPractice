package com.wallace.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {

	private void create(String[] classStrs) throws Exception {

		for (String className : classStrs) {

			Class<?> cl = Class.forName(className);
			DBTable dbTable = cl.getAnnotation(DBTable.class);

			String tableName = dbTable.name();

			List<String> columnDefs = new ArrayList<String>();
			String tableCreate = "";
			for (Field field : cl.getDeclaredFields()) {
				String columnName = null;
//				Annotation[] anns = field.getDeclaredAnnotations();
				Annotation[] anns = field.getAnnotations();

				if (anns[0] instanceof SQLInteger) {
					SQLInteger sInt = (SQLInteger) anns[0];
					columnName = field.getName().toUpperCase();
					columnDefs.add(columnName + " INT "
							+ getConstraints(sInt.constraints()));
				}
				if (anns[0] instanceof SQLString) {
					SQLString sString = (SQLString) anns[0];
					columnName = field.getName().toUpperCase();
					columnDefs.add(columnName + " VARCHAR(" + sString.value()
							+ ")" + getConstraints(sString.constraints()));
				}

				StringBuilder createCommand = new StringBuilder("CREATE TABLE "
						+ tableName + "(");
				for (String columnDef : columnDefs) {
					createCommand.append("\n " + columnDef + ",");
				}
				tableCreate = createCommand.substring(0,
						createCommand.length() - 1)
						+ ")";
//				System.out.println("Table creation SQL for " + className
//						+ " is: \n" + tableCreate);
			}
			System.out.println("Table creation SQL for " + className
					+ " is: \n" + tableCreate);
		}
	}

	private String getConstraints(Constraints con) {
		String constraints = "";
		if (!con.allowNull()) {
			constraints += " NOT NULL";
		}
		if (con.primaryKey()) {
			constraints += " PRIMARY KEY";
		}
		if (con.unique()) {
			constraints += "UNIQUE";
		}
		return constraints;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] classStrs = { "com.wallace.annotation.Member" };
		new TableCreator().create(classStrs);
	}
}
