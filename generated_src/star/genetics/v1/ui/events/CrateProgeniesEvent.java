/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v1.ui.events;

public class CrateProgeniesEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public CrateProgeniesEvent(star.event.Raiser raiser, boolean valid)
	{
		super(raiser, valid);
	}

	public CrateProgeniesEvent(star.genetics.v1.ui.events.CrateProgeniesEvent event)
	{
		super(event);
	}

	public CrateProgeniesEvent(star.genetics.v1.ui.events.CrateProgeniesRaiser raiser)
	{
		super(raiser);
	}

}