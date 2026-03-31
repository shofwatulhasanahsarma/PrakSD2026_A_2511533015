package pekan1_2511533015;
//public final class Jam {
//	private int hh; // 0..23
//	private int mm; // 0..59
//	private int ss; // 0..59
//	
//	// ---Validator ---
//	public static boolean isValid (int h, int m, int s) {
//		return (0 <= h && h <= 23) && ( 0 <= m && m <= 59) && ( 0 <= s &&  s <= 59);
//	}
//	// ---Konstruktor/Kreator---
//	public Jam (int h, int m, int s) {
//		this.hh = h; this.mm = m; this.ss = s;
//	}
//	// ---Selektor---
//	public int getHour () {return hh;}
//	public int getMinute () {return mm;}
//	public int getSecond () {return ss;}
//	
//    // ---Mutator---
//	public  void setHour(int h) {this.hh = h; }
//	public void setMinute(int m) {this.mm = m;}
//	public void setSecond(int s) {this.ss = s;}
//	// ---Konversi===
//	public int toSeconds () {return hh * 3600 + mm * 60 + ss;}
//	public static Jam fromSeconds (int total) {
//		if (total < 0) throw new IllegalArgumentException ("detik negatif");
//		total %= 24 * 3600; //wrap 24 jam
//		int h = total /3600 ; total %= 3600;
//		int m = total /60 ; int s = total % 60;
//		return new Jam (h,m,s);
//		}
//	//---Relasional---
//	public int compareTo (Jam other) (return Integer.compare(this.toSeconds (), other.toSeconds ());}
//	public boolean equals (Object o) {
//		if (!(o instanceof Jam j)) return false;
//		return hh == j.hh && mm == j.mm && ss == j.ss;
//		
//	}
