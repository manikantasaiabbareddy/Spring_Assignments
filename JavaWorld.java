package com.training;

public class JavaWorld implements JavaLanguage{
	private PythonWorld c;
	

	public JavaWorld(PythonWorld c) {
		this.c = c;
	}


	@Override
	public String learningJava() {
		// TODO Auto-generated method stub
		return "I am learning Java";
	}

	


	
	public String learningPython() {
		
		return c.learningPython();
	}
}
