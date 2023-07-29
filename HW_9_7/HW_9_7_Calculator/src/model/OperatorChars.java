package model;

public enum OperatorChars {
    ADD ("+ введите ADD"),
    SUBTRACT ("- введите SUBTRACT"),
    MULTIPLY ("* введите MULTIPLY"),
    DIVIDE ("/ введите DIVIDE");

    private String operChar;

    OperatorChars (String operChar){
        this.operChar = operChar;
    }

    public void setOperChar (OperatorChars operatorChars){
        this.operChar = String.valueOf(operatorChars);
    }

    public String getOperChar() {
        return operChar;
    }

    @Override
    public String toString() {
        return operChar;
    }
}
