package com.prabhat.interview;
class Program6{
	int i=3;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Program6 other = (Program6) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
	 
	 
}