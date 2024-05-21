package New.CSE305_LAB5;


public abstract class Contract {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private double rentAmount;

    public Contract(int contractID, int propertyID, int tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    // getters and setters
    public int getContractID() {
        return contractID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public int getTenantID() {
        return tenantID;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public abstract String getTerm();
}

// PermanentContract.java
 class PermanentContract extends Contract {
    public PermanentContract(int contractID, int propertyID, int tenantID, double rentAmount) {
        super(contractID, propertyID, tenantID, rentAmount);
    }

    @Override
    public String getTerm() {
        return "Permanent";
    }
}

// LongTermContract.java
 class LongTermContract extends Contract {
    public LongTermContract(int contractID, int propertyID, int tenantID, double rentAmount) {
        super(contractID, propertyID, tenantID, rentAmount);
    }

    @Override
    public String getTerm() {
        return "LongTerm";
    }
}

// ShortTermContract.java
 class ShortTermContract extends Contract {
    public ShortTermContract(int contractID, int propertyID, int tenantID, double rentAmount) {
        super(contractID, propertyID, tenantID, rentAmount);
    }

    @Override
    public String getTerm() {
        return "ShortTerm";
    }
}

// ContractBuilder.java
 class ContractBuilder {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private double rentAmount;

    public ContractBuilder buildContractID(int contractID) {
        this.contractID = contractID;
        return this;
    }

    public ContractBuilder buildPropertyID(int propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    public ContractBuilder buildTenantID(int tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    public ContractBuilder buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    public Contract signContract(String term) {
        if (term.equals("Permanent")) {
            return new PermanentContract(contractID, propertyID, tenantID, rentAmount);
        } else if (term.equals("LongTerm")) {
            return new LongTermContract(contractID, propertyID, tenantID, rentAmount);
        } else if (term.equals("ShortTerm")) {
            return new ShortTermContract(contractID, propertyID, tenantID, rentAmount);
        } else {
            throw new UnsupportedOperationException("Invalid term");
        }
    }
}