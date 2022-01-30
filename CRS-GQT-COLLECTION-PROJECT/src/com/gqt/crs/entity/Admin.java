/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author Bindu
 *
 * 
 */
public class Admin {
		private int admin_Id;
		private String admin_pwd;
		public Admin(int admin_Id, String admin_pwd) {
			super();
			this.admin_Id = admin_Id;
			this.admin_pwd = admin_pwd;
		}
		public int getAdmin_Id() {
			return admin_Id;
		}
		public void setAdmin_Id(int admin_Id) {
			this.admin_Id = admin_Id;
		}
		public String getAdmin_pwd() {
			return admin_pwd;
		}
		public void setAdmin_pwd(String admin_pwd) {
			this.admin_pwd = admin_pwd;
		}
		
		
}
