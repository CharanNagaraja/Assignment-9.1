package assignment9;



import java.util.Comparator;


public class comporator implements Comparator<hdtv> {

	
	public int compare(hdtv o1, hdtv o2) {
		hdtv hdtv1 = (hdtv) o1;
		hdtv hdtv2 = (hdtv) o2;
		if (hdtv1.getSize() > hdtv2.getSize())
			return 1; // Returns a positive integer when first argument is greater than the second
		else if (hdtv1.getSize() < hdtv2.getSize())
			return -1;//. Returns a negative integer when first argument is less than the second
		else
			return 0;// Returns 0  when first argument is same as  the second

	}

}