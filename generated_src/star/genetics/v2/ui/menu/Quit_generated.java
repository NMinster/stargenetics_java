/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v2.ui.menu;

abstract class Quit_generated extends star.genetics.v2.ui.menu.MenuItem implements star.event.EventController
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  Quit_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		super.addNotify();
	}
	 
	public star.event.Adapter getAdapter()
	{
		if( adapter == null )
		{
			adapter = new star.event.Adapter(this);
		}
		return adapter;
	}
	 
	public void removeNotify()
	{
		super.removeNotify();
	}
	 
}