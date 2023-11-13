package _03_de_comportamiento.cor01.src;

public interface IHandler {
	public IHandler getSuccesor();

	public void setSuccesor(IHandler succesor);

	public void Handle(Request request) throws Exception;
}
