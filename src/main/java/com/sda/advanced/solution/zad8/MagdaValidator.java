package com.sda.advanced.solution.zad8;

public class MagdaValidator implements Validator{

	@Override
	public boolean validate(Parcel input) {
		if(isLengthOfEveryDigitHigherThan30(input) && isSumOfDigitsLowerThan300(input) && isWeightProper(input)){
			return true;
		} return false;
	}

	private boolean isSumOfDigitsLowerThan300(Parcel parcel) {
		int sum = parcel.getxLength() + parcel.getyLength() + parcel.getzLength();
		if (sum < 300) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isLengthOfEveryDigitHigherThan30(Parcel parcel) {
		if(parcel.getxLength() < 30 || parcel.getyLength() < 30 || parcel.getzLength() < 30){
			return false;
		}
		return true;
	}

	private boolean isWeightProper(Parcel parcel) {
		if (parcel.isExpress()) {
			if (parcel.getWeight() > 15) {
				return false;
			}
		} else {
			if (parcel.getWeight() > 30) {
				return false;
			}
		}  return true;
	}
}
