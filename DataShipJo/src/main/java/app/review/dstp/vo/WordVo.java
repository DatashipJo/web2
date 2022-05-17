package app.review.dstp.vo;

public class WordVo extends StoreVo
{
	
	private int num;
	private int fk;
	private String store;
	private String word;
	private String ck_word1;
	private String ck_word2;
	private String ck_word3;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getFk() {
		return fk;
	}
	public void setFk(int fk) {
		this.fk = fk;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}

	public String getCk_word1() {
		return ck_word1;
	}

	public void setCk_word1(String ck_word1) {
		this.ck_word1 = ck_word1;
	}

	public String getCk_word2() {
		return ck_word2;
	}

	public void setCk_word2(String ck_word2) {
		this.ck_word2 = ck_word2;
	}

	public String getCk_word3() {
		return ck_word3;
	}

	public void setCk_word3(String ck_word3) {
		this.ck_word3 = ck_word3;
	}
	
}