/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v2.ui.yeast.common;

abstract class ReplicaPanelController_generated extends javax.swing.JPanel implements star.event.EventController
{
	private star.event.Adapter adapter;
	private star.genetics.v1.ui.model.CrateModel model;
	private star.genetics.genetic.model.CreatureSet progenies;
	private static final long serialVersionUID = 1L;

	public  ReplicaPanelController_generated()
	{
		super();
	}
	 
	public  ReplicaPanelController_generated(boolean boolean0)
	{
		super(boolean0);
	}
	 
	public  ReplicaPanelController_generated(java.awt.LayoutManager layoutManager, boolean boolean0)
	{
		super(layoutManager,boolean0);
	}
	 
	public  ReplicaPanelController_generated(java.awt.LayoutManager layoutManager)
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
	 
	public star.genetics.v1.ui.model.CrateModel getModel()
	{
		return this.model ;
	}
	 
	public star.genetics.genetic.model.CreatureSet getProgenies()
	{
		return this.progenies ;
	}
	 
	public void removeNotify()
	{
		super.removeNotify();
	}
	 
	protected void setModel(star.genetics.v1.ui.model.CrateModel model)
	{
		this.model = model ;
	}
	 
	protected void setProgenies(star.genetics.genetic.model.CreatureSet progenies)
	{
		this.progenies = progenies ;
	}
	 
}