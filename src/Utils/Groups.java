package Utils;

public enum Groups {
	ZKBUILDER("!#979797&lZK.BUILDER!#2B8D17"),
	BUILDER("!#62CE0E&lBUILDER!#2B8D17"),
	ZKHELPER("!#979797&lZK.HELPER!#681580"),
	HELPER("!#D01E42&lHELPER!#681580"),
	EVENTER("!#E6A417&lEVENTER!#E25A07"),
	EVENTERKA("!#E6A417&lEVENTERKA!#E25A07"),
	ADMIN("!#DA0C1F&lADMIN!#FB430D"),
	DEV("!#13A1A1&lDEVELOPER!#5CE7E8"),
	ZAKLADATEL("!#186B13&lZAKLADATEL!#2A5831"),
	MAJITEL("!#2CDD86&lMAJITEL!#0E7B8C");
	private String prefix = "&aPozice: ";
	private String a;
	private Groups(String a) {
		this.a=a;
	}
	public String get() {
		return prefix + a;
	}
}
