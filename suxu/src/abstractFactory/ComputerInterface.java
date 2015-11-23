package abstractFactory;

public abstract class ComputerInterface {
	private  CPUInterface cpu;

	private  MemoryInterface m;
	
	public CPUInterface getCpu() {
		return cpu;
	}
	public void setCpu(CPUInterface cpu) {
		this.cpu = cpu;
	}
	public MemoryInterface getM() {
		return m;
	}
	public void setM(MemoryInterface m) {
		this.m = m;
	}
	
}
