package MyPack;

public class Details
{
private int Fno;
private String Fnm;
private long Ddt;
private long Adt;
private String Dpl;
private String Opl;
private int st;
private int reg;
private int can;

public int getReg() {
	return reg;
}
public void setReg(int reg) {
	this.reg = reg;
}
public int getCan() {
	return can;
}
public void setCan(int can) {
	this.can = can;
}
public int getFno()
{
	return Fno;
}
public void setFno(int fno)
{
	this.Fno = fno;
}
public String getFnm() 
{
	return Fnm;
}
public void setFnm(String fnm)
{
	Fnm = fnm;
}
public long getDdt()
{
	return Ddt;
}
public void setDdt(long ddt)
{
	Ddt = ddt;
}
public long getAdt() 
{
	return Adt;
}
public void setAdt(long adt)
{
	Adt = adt;
}
public String getDpl()
{
	return Dpl;
}
public void setDpl(String dpl)
{
	Dpl = dpl;
}
public String getOpl()
{
	return Opl;
}
public void setOpl(String opl)
{
	Opl = opl;
}
public int getSt()
{
	return st;
}
public void setSt(int st)
{
	this.st = st;
}

public String toString()
{
	return getFno()+"\t"+getFnm()+"\t "+getDdt()+"\t"+getAdt()+"\t"+getDpl()+"\t"+getOpl()+"\t"+getSt();
			
	
}


}
