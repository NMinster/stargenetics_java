/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v2.ui.fly.properties;

abstract class PropertiesPanel_generated extends javax.swing.JPanel implements star.event.EventController, star.genetics.v2.yeast.events.CreaturePropertiesChangedRaiser
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  PropertiesPanel_generated()
	{
		super();
	}
	 
	public  PropertiesPanel_generated(boolean boolean0)
	{
		super(boolean0);
	}
	 
	public  PropertiesPanel_generated(java.awt.LayoutManager layoutManager, boolean boolean0)
	{
		super(layoutManager,boolean0);
	}
	 
	public  PropertiesPanel_generated(java.awt.LayoutManager layoutManager)
	{
		super(layoutManager);
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
	 
	public void raise_CreaturePropertiesChangedEvent()
	{
		(new star.genetics.v2.yeast.events.CreaturePropertiesChangedEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		super.removeNotify();
	}
	 
}