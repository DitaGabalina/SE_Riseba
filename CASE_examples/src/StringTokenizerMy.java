
import java.util.StringTokenizer;

public class StringTokenizerMy {
	private int tokensCount;
	String initialString;
	StringTokenizer st;
	
	public StringTokenizerMy(String vString){
		
		initialString = vString;
		st = new StringTokenizer(vString);
		setTokensCount(st.countTokens());
	}
	
	public String nextElement(){
		if (st.hasMoreTokens() ) {
		return st.nextElement().toString();
		}
		else {
			return "";
			}
	}
	

	int getTokensCount() {
		return tokensCount;
	}

	private void setTokensCount(int tokensCount) {
		this.tokensCount = tokensCount;
	}
}