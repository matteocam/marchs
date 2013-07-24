package marchs

/*
 * Two modes for calling the application:
 * - extraction: when you show a cookie
 * - download: when you lookup on wikiquote
*/

object Marchs {
    def main(args: Array[String]) {
      // XXX: should be determined by a CLI parameter
      val extractQuoteMode:Boolean = true

      // XXX: should be dependent on configuration
      val defaultSource = "Marx" // XXX: should be an object
      // XXX: should be variable from other factors
      val source = defaultSource

      if (extractQuoteMode) {
	// create extractor
	val ce = new CookieExtractor(source)
	// print extracted source
	println ( ce.extractCookie )
      } else { // download mode
	
      }
  }
}

package object marchs { 
  type CookieSource = String
}

class CookieExtractor(val source:marchs.CookieSource) 
{
  def extractCookie:String = null
}

