Notes on Marchs software
------------------------

Marchs is a variant of the cookie extractor UNIX program fortune.
In normal mode Marchs shows a random cookie extracted from a DB.
What Marchs has as a specific feature is the ability to automatically download
quotes from Wikiquote.

Usage
--------

[code]
$ marchs
[/code]

[output] 
"Art, culture and all that crap just come from the way production works."
Marx - Remastered
[/output]

[code]
$ marchs --fetch Engels
[/code]

[output]
Querying Wikiquote database...
The following entries has been found that corresponds to "Engels":
1) Friedrich Engels - (18?? - 18??) Philosopher
2) George Engels - () American Mathematician
3) Sissy Engels - (198?-) Polish top-model
[/output]


