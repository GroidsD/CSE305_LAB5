package New.CSE305_LAB5;

public class Main {
    public static void main(String[] args) {
        Contract contract = new ContractBuilder()
                .buildContractID(1256)
                .buildPropertyID(200)
                .buildTenantID(35)
                .buildRentAmount(100000.0)
                .signContract("Permanent");
        System.out.println();
        System.out.println("Contract ID: " + contract.getContractID());
        System.out.println("Property ID: " + contract.getPropertyID());
        System.out.println("Tenant ID: " + contract.getTenantID());
        System.out.println("Rent Amount: " + contract.getRentAmount());
        System.out.println("Term: " + contract.getTerm());
    }
}