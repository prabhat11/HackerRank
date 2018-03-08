package com.prabhat.interview;
class Address1{
	int  j=4;


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address1 other = (Address1) obj;
		if (j != other.j)
			return false;
		return true;
	}
	
	
}