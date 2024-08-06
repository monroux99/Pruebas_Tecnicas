package Clases;

public class Persona {
	
	char sexo;
    int edad;

    //Constructor
    public Persona(char sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    //GETTERS SETTERS
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
