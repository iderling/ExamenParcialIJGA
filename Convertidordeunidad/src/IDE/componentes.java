package IDE;

public class componentes {
	
	public int bytes;
	public int kb= 1;
	public int mb;
	
	public componentes(int bytes, int kb, int mb) {
		super();
		this.bytes = bytes;
		this.kb = kb;
		this.mb = mb;
	}

	public int getBytes() {
		return bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	public int getKb() {
		return kb;
	}

	public void setKb(int kb) {
		this.kb = kb;
	}

	public int getMb() {
		return mb;
	}

	public void setMb(int mb) {
		this.mb = mb;
	}
	
	

}
