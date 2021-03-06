package star.genetics.genetic.model;

import java.util.Map;

public interface Creature extends Comparable<Creature>
{
	public static enum Sex
	{
		MALE, FEMALE;
		
		public static Sex parse(String sex)
		{
			for( Sex s : Sex.values() )
			{
				if( sex.equalsIgnoreCase( s.name() ))
				{
					return s ;
				}
			}
			throw new IllegalArgumentException(sex);
		}
	};

	public String getName();

	public Genome getGenome();

	public GeneticMakeup getMakeup();

	public Sex getSex();

	public boolean isReadOnly();

	public void setName(String string);

	public void setReadOnly(boolean selected);

	public String getNote();

	public void setNote(String string);

	public boolean isMateable();

	public void mated();

	public Map<String, String> getProperties();

	public CreatureSet getParents();

	public String getUUID();
}
