package sample;

public class Encapsulation {
	private String name;
	private int securitycode;
	private int deptcode;
	private int branchcode;
	private String branchname;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSecuritycode() {
		return securitycode;
	}

	public void setSecuritycode(int securitycode) {
		this.securitycode = securitycode;
	}

	public int getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}

	public int getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(int branchcode) {
		this.branchcode = branchcode;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setName("XXX");
		e.setBranchname("YYY");
		e.setBranchcode(8472);
		e.setSecuritycode(5148);
		e.setDeptcode(5632);
		System.out.println("Name: "+e.getName()+" "+"Branch Name: "+e.getBranchname()+" "+"Branch Code: "+e.getBranchcode()+" "+"Security code: "+e.getSecuritycode()+" "+"Department code: "+e.getDeptcode());
	}
}
