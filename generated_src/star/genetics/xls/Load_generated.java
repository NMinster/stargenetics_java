/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.xls;

abstract class Load_generated extends java.lang.Object implements star.event.EventController, star.event.Listener, star.genetics.events.ErrorDialogRaiser, star.genetics.events.LoadModelRaiser
{
	private star.event.Adapter adapter;
	private java.lang.Exception errorMessage;
	private static final long serialVersionUID = 1L;

	public  Load_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		getAdapter().addHandled( star.genetics.events.OpenModelEvent.class );
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
			(new star.genetics.events.LoadModelEvent(this,false)).raise();
			openModel( (star.genetics.events.OpenModelRaiser)event.getSource());
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
	 
	public java.lang.Exception getErrorMessage()
	{
		return this.errorMessage ;
	}
	 
	abstract void openModel(star.genetics.events.OpenModelRaiser OpenModelRaiser);
	 
	public void raise_ErrorDialogEvent()
	{
		(new star.genetics.events.ErrorDialogEvent(this)).raise();
	}
	 
	public void raise_LoadModelEvent()
	{
		(new star.genetics.events.LoadModelEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		getAdapter().removeHandled( star.genetics.events.OpenModelEvent.class );
	}
	 
	public void setErrorMessage(java.lang.Exception errorMessage)
	{
		this.errorMessage = errorMessage ;
	}
	 
}