package in.ineuron.comp;

public class Car {
	
	private String refNo;
	private String engineNo;
	private String model;
	private String type;
	private int engineCC;
	private String color;
	private String owner;
	private String fuelType;
	
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Car [refNo=" + refNo + ", engineNo=" + engineNo + ", model=" + model + ", type=" + type + ", engineCC="
				+ engineCC + ", color=" + color + ", owner=" + owner + ", fuelType=" + fuelType + "]";
	}
	
	
}
