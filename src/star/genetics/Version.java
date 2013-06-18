/* Created by JReleaseInfo AntTask from Open Source Competence Group */
/* Creation date Thu May 09 12:01:02 EDT 2013 */
package star.genetics;

import java.util.Date;

/**
 * This class provides information gathered from the build environment.
 * 
 * @author JReleaseInfo AntTask
 */
public class Version {


   /** buildDate (set during build process to 1368115262133L). */
   private static Date buildDate = new Date(1368115262133L);

   /**
    * Get buildDate (set during build process to Thu May 09 12:01:02 EDT 2013).
    * @return Date buildDate
    */
   public static final Date getBuildDate() { return buildDate; }


   /** project (set during build process to "StarGenetics"). */
   private static String project = new String("StarGenetics");

   /**
    * Get project (set during build process to "StarGenetics").
    * @return String project
    */
   public static final String getProject() { return project; }

}