/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v2.ui.common;

abstract class CommonMenuBar_generated extends javax.swing.JMenuBar implements star.event.EventController, star.event.Listener
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  CommonMenuBar_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		super.addNotify();
		getAdapter().addHandled( star.genetics.events.OpenModelEvent.class );
		getAdapter().addHandled( star.genetics.events.LoadModelEvent.class );
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.genetics.events.OpenModelEvent" ) && event.isValid() ) 
		{
			 long start = System.nanoTime();
			
			openFile( (star.genetics.events.OpenModelRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".openFile "  + ( end-start )/1000000 ); } 
		}
		if( event.getClass().getName().equals( "star.genetics.events.LoadModelEvent" ) && event.isValid() ) 
		{
			 long start = System.nanoTime();
			
			openModel( (star.genetics.events.LoadModelRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".openModel "  + ( end-start )/1000000 ); } 
		}
	}
	 
	public star.event.Adapter getAdapter()
	{
		if( adapter == null )
		{
			adapter = new star.event.Adapter(this);
		}
		return adapter;
	}
	 
	abstract void openFile(star.genetics.events.OpenModelRaiser OpenModelRaiser);
	 
	abstract void openModel(star.genetics.events.LoadModelRaiser LoadModelRaiser);
	 
	public void removeNotify()
	{
		super.removeNotify();
		getAdapter().removeHandled( star.genetics.events.OpenModelEvent.class );
		getAdapter().removeHandled( star.genetics.events.LoadModelEvent.class );
	}
	 
}