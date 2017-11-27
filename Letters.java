/**
 * This class is created to make TextGenerator easier to read.
 * Use this class as a dictionary for each letter/input value.
 *
 * @author Logan Duck (logan.duck@yahoo.com)
 */
public class Letters {
	/* getA-Z() outputs the specific letters. */
	public static String getA() {
		return "AAAAAAAA\nAA    AA\nAA    AA\nAAAAAAAA\nAA    AA\nAA    AA\nAA    AA\n" + ln();
	}

	public static String getB() {
		return "BBBBBBBB\nBB    BB\nBB    BB\nBBBBBBB\nBB    BB\nBB    BB\nBBBBBBB\n" + ln();
	}

	public static String getC() {
		return "CCCCCCCC\nCC\nCC\nCC\nCC\nCC\nCCCCCCCC\n" + ln();
	}

	public static String getD() {
		return "DDDDDDD\nDD    DD\nDD    DD\nDD    DD\nDD    DD\nDD    DD\nDDDDDDD\n" + ln();
	}
	
	public static String getE() {
		return "EEEEEEEE\nEE\nEE\nEEEEEEEE\nEE\nEE\nEEEEEEEE\n" + ln();
	}

	public static String getF() {
		return "FFFFFFFF\nFF\nFF\nFFFFFFF\nFF\nFF\nFF\n" + ln();
	}

	public static String getG() {
		return " GGGGGGG\nGG\nGG\nGG    GGG\nGG    GG\nGG    GG\n GGGGGG\n" + ln();
	}

	public static String getH() {
		return "HH    HH\nHH    HH\nHH    HH\nHHHHHHHH\nHH    HH\nHH    HH\nHH    HH\n" + ln();
	}

	public static String getI() {
		return "IIIIIIII\n   II\n   II\n   II\n   II\n   II\nIIIIIIII\n" + ln();
	}

	public static String getJ() {
		return " JJJJJJJJ\n    JJ\n    JJ\nJ   JJ\nJJ  JJ\n JJJJ\n" + ln();
	}

	public static String getK() {
		return "KK    KK\nKK   KK\nKK  KK\nKK KK\nKK  KK\nKK   KK\nKK    KK\n" + ln();
	}

	public static String getL() {
		return "LL\nLL\nLL\nLL\nLL\nLL\nLLLLLLLL\n" + ln();
	}

	public static String getM() {
		return "MMM       MMM\nMM M     M MM\nMM MM   MM MM\nMM  MM MM  MM\nMM   MMM   MM\nMM    M    MM\nMM         MM\n" + ln();
	}

	public static String getN() {
		return "NNN     NN\nNNNN    NN\nNN NN   NN\nNN  NN  NN\nNN   NN NN\nNN    NNNN\nNN     NNN\n" + ln();
	}

	public static String getO() {
		return "OOOOOOOOOO\nOO      OO\nOO      OO\nOO      OO\nOO      OO\nOO      OO\nOOOOOOOOOO\n" + ln();
	}

	public static String getP() {
		return "PPPPPPPP\nPP    PP\nPP    PP\nPPPPPPPP\nPP\nPP\nPP\n" + ln();
	}

	public static String getQ() {
		return "QQQQQQQQQQ\nQQ      QQ\nQQ      QQ\nQQ      QQ\nQQ      QQ\nQQ   QQ QQ\nQQQQQQQQQQ\n       QQ\n" + ln();
	}

	public static String getR() {
		return "RRRRRRRR\nRR    RR\nRR    RR\nRRRRRRRR\nRR   RR\nRR    RR\nRR     RR\n" + ln();
	}

	public static String getS() {
		return "SSSSSSSS\nSS\nSS\nSSSSSSSS\n      SS\n      SS\nSSSSSSSS\n" + ln();
	}

	public static String getT() {
		return "TTTTTTTT\n   TT\n   TT\n   TT\n   TT\n   TT\n   TT\n" + ln();
	}

	public static String getU() {
		return "UU     UU\nUU     UU\nUU     UU\nUU     UU\nUU     UU\nUU     UU\nUUUUUUUUU\n" + ln();
	}

	public static String getV() {
		return "VV        VV\n VV      VV\n  VV    VV\n   VV  VV\n    VVVV\n     VV\n" + ln();
	}

	public static String getW() {
		return "WW         WW\nWW    W    WW\nWW   WWW   WW\nWW  WW WW  WW\nWW WW   WW WW\nWW W     W WW\nWWW       WWW\n" + ln();
	}

	public static String getX() {
		return "XX      XX\n XX    XX\n  XX  XX\n   XXXX\n  XX  XX\n XX    XX\nXX      XX\n" + ln();
	}

	public static String getY() {
		return "YY      YY\n YY    YY\n  YY  YY\n   YYYY\n    YY\n    YY\n    YY\n" + ln();
	}

	public static String getZ() {
		return "ZZZZZZZZ\n     ZZ\n    ZZ\n   ZZ\n  ZZ\n ZZ\nZZZZZZZZ\n" + ln();
	}
	/* getA-Z() outputs the specific letters. */

	/* adds space between multiple words */
	public static String space() {
		return "\n\n\n";	
	}

	/* adds a line between each letter */
	public static String ln() {
		return "\n";
	}

	/* input for TextGenerator must be less than 100 length */
	public static String tooLarge() {
		return "input too large, try again.";
	}
}