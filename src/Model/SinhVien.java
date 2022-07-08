package Model;

public class SinhVien {
    private String Name;
    private String SDT;
    private String Birthday;
    private Boolean GT;
    private String DiaChi;
    private Boolean TinhTrang;
    private int ID;
    public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

    public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	public Boolean getGT() {
		return GT;
	}

	public void setGT(Boolean gT) {
		GT = gT;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public Boolean getTinhTrang() {
		return TinhTrang;
	}

	public void setTinhTrang(Boolean tinhTrang) {
		TinhTrang = tinhTrang;
	}


}
