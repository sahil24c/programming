package com.bridgelabz.designpatterns;

public class SocketAdapterImp implements SocketAdapter{

private Socket sock = new Socket();
@Override
	public Volt get120() {
		// TODO Auto-generated method stub
		return sock.getVolt();
	}

	@Override
	public Volt get12() {
		// TODO Auto-generated method stub
		Volt v = sock.getVolt();
		return convert(v,10);
	}

	@Override
	public Volt get3() {
		// TODO Auto-generated method stub
		Volt v= sock.getVolt();
		
		return convert(v,40);
	}
	public Volt convert(Volt v, int i)
	{
		
		return new Volt(v.getVolt()/i);
	}

}
