# LaaS


- Mest inspiration - måske ikke så praktisk i vores day2day, 
	men hvis man kender noget er der større chance for inspiration/brug, end hvin man ikke gør
- Yoana & Andreas diskussion om funktionel programmering
- Programmings historie
- Hosted language
- Nubank som spændende case

- Priya havde den samme pointe mht frontend > : Thore Alrø > *Noget visuelt der reagerede på det jeg gjorde*
- code as a crime scene > git-truck
- https://www.youtube.com/watch?v=tRc0O9VgzB0 kyle kingsbury: a fsyncing feeling


#### Step 1: Set Learning Objectives.
1. Lær lisp og clojure at kende -> historie
2. Lær konceptet REPL
3. CALVA + REPL => cool udviklingsmiljø (cursive til intellij folket)
4. Lær noget cool om CLJ / LISP? 
		-> java inter-op
		-> args?
		-> Re-write the language?
		-> hiccup
		-> framework?

#### Step 2: Use a Framework.
1. Kolb’s learning cycle is widely used in training design, especially when it comes to working with adult learners. 
KOLB
- **Concrete experience,** with room for practical, experiential activities;
- **Reflective observation:** a time to debrief, form opinions on what the exercise revealed, and discuss them with others;
- **Abstract conceptualization**, when it’s up to the trainer to offer models, theories and frameworks conducive to deeper understanding and, lastly
- **Active experimentation,** in which participants are guided to begin applying new learnings to real-world situations, for example with a role play or simulation.
	https://clojurescriptkoans.com/

#### Step 3: Create an Opening Section.

- 
#### Step 4: Structure the Agenda.

#### Step 5: Include Multiple Learning Styles.

#### Step 6: Pay Attention to Closing and Follow-up.

#### Step 7: Prepare Training Materials.
Powerpoint
Clojurescript koans
#### Step 8: Share Your Plan.
- opdater email invitationen med en teaser


-----------------------


### Lead day forberedelse ?? tid??

###### Kort intro
Hej med jer i ved hvem i er, og i ved hvem jeg er :-D
I har jo tit hørt den sure gamle mand - som jeg er ved at blive - hviske og tiske 
om Clojure og andre ting som jeg synes virker spændende.
Og nogen gange så føler jeg... at i er ved at få et ganske særligt indre billede af mig?!

*Gandalf billede her*

###### Rationale(r)
- Jeg vil gerne kunne dele lidt af det her med jer forhåbentligt uden at lyde som en forstokket ogginok.
- Jeg tror på at nogen af de her ting bliver vores fremtid.
- Jeg tror at det vil gøre vores arbejde både bedre og sjovere.

*mccarthy billede her*

###### historie.. a more civilized age (svag overgang)
Jeg forsøgte her at lave en slags intro til hvordan jeg blev interesseret i Clojure til at begynde med.
Men helt ærligt så kan jeg ikke rigtigt huske hvor jeg hørte om det.
Det har formentligt været en Rich Hickey talk af en art, men jeg har sgu glemt det.
I hvert fald endte jeg med at komme sådan lidt full circle tilbage til Lisp og frem til Clojure..

###### historie... oversigt
Men i hvert fald har jeg siden forsøgt at grave lidt i vores fags historie,
da jeg har lidt en svaghed for at finde forklaringer til ting i historien... 
... Jeg forsøgte at finde en god oversigt over programmerings-sprogs-tidslinier
men måtte konkludere at den var for meget..

*vis stor svg*

og hvis man går lidt baglæns i vores historie.. til engang i 50'erne.
Så lander man jo ved nogen af de første highlevel programmeringssprog
og det er her Fortran og Lisp jeg tænker på, 
hvoraf Lisp er ret spændende fordi det var lidt forud for sin tid 
Det havde bla garbage collection og Chris' yndlings feature > dynamiske typer.

Men tænk lige over det; hvor vildt er det ikke at opfinde garbage collection i 50erne når 
du knap nok har hukommelse nok til at holde koden til programmet?! >> overdrivelse fremmer forståelsen.

###### historie... state of the art?...

Og hvis man spoler de 2 sprog frem til i dag går der en slags linie fra Fortran til C til C++ til Java/C#
Og en linie fra LISP til Scheme til CommonLisp til Clojure

Og en af de store forskelle på de 2 "sprog-stammer" er i mine øjne "interaktivitet".

###### Tænkning
- Bage-opskrifts-tænkning vs Live-tænkning.

Hvilket jo giver god mening, du kommer fra et miljø hvor du skulle putte et hulkurt i en fysisk kø og så kørte dit program om natten og du fik svaret om morgenen!! 

Men det er jo ikke sådan vores computer tid længere fungerer! 
Vi har jo computere der er flere hestekræfter end vi ved hvad vi skal bruge dem til.
Og vi har adgang til dem.. HELE TIDEN :-D

Profound enlightenment da jeg læste Bob c Martin : du vil ikke release noget du ikke har kørt mindst 1 gang - > i relation til hvorfor test driven er godt.. 
-> Det er lidt samme argument der er godt for REPL :-)

Lidt om Clojure og Funktionel programmering.
Jeg håber det kan fjerne den der - konstante - frygt for at der altid er noget galt et eller andet sted.
Og at man har overset det...

- mellem 25 og 45 kan ikke innovere! :-O

###### Live  Coding
Så derfor vil jeg lige prøve at vise jer lidt små eksempler på "live coding"

- API Eksempel
- Macro eksempel 
  Det er ret sejt men hvad skal man bruge det til? det ved jeg ikke så meget fantasi har jeg ikk!

###### 

###### Resten...
- Figwheel
- ui udvikling og jo mere avanceret jo oftere sidder man og logger ind og clicker frem 
   og tilbage og frem og tilbage for at komme til samme stadie som man var på 
   da man tilføjede en ekstra function...
- Memento (as little memory as possible - but we have a whole brain now!!)
- Døgenigt
- Christopher Alexander -> A Pattern Language

###### Min og Jeres historie ind i programmering
2009 EAL 
Python + PHP + SQL 
HTML + CSS
2011 IHK
Java
2015 Jobs..
JavaScript


-> Devtools i Chrome (og her tænker nogen at det måske er sent, men jeg vil lige pointere at chrome blev udgivet i 2008 -> jeg var på opera mens det var norsk)
-> jQuery spaghetti hos Isobar især jquery.. men også moderne frameworks.. gl til den der skal læse dem om et par år med alle deres best practices.. jeg skulle også fiske noget knockout.js op på et tidspunkt... så hellere vanilla eller jquery...

... Clojure/Lisp

12-13 år i alt nu ...

###### Consider your topic. ...
No silver bullet..

"Clojure"
-> Tids-aspektet i software -> xtdb / datomic eksempel
-> REPL -> Hot reloading on stereoids -> API Eksempel? -> Live coding eksempel
-> Forsøg at holde statisk vs dynamisk ude af diskussionen?

###### Consider your audience. ...
-> Meme øvelser her med hvilket sprog man mest føler man er! 

-> Stensig jeg har reflekteret lidt over vores snak, og jeg synes sgu egentligt stadig mit argument
med for meget objektificering er validt.. fint du har en anden holdning men du fik også 5-10x så meget kode ud af det. og formentligt også 5-10x så mange bugs :-)

###### Plan
- (5-10) Hej med jer i ved hvem i er + setup
- (5-10) Start med MEMEs -> Find Memes!! -> Print dem ud?
- (10 - 20?)  "Demo" / REPL / Live coding
- (?-?)  Snak om Database(r)
- Snak om os selv
- (?-?) "Diskussion" / Tid

"Clojure" -> is a LISP -> What is LISP?
-> Tids-aspektet i software -> xtdb / datomic eksempel
->  REPL -> Hot reloading on stereoids -> API Eksempel? -> Live coding eksempel

###### Other

####### LISP 
[Wiki](https://en.wikipedia.org/wiki/Lisp_(programming_language)) Lisp pioneered many ideas in computer science, including 
- tree data structures, 
- automatic storage management (Garbadge collection), 
- dynamic typing, 
- conditionals,
- higher-order functions,
- recursion,
- the self-hosting compiler,
- and the read–eval–print loop

- svær syntax i andre sprog vs ()
- ( ) var en "fejl" som mccarthy regnede med at fjerne -> Exaptive

Snowden random pointer
- had to ban developers from changing the objects because there was 0 re-use
- 25 - 45 dont innovate =:(  ->  medminder vi bliver stresset til det =:0
- Abstraction -> novel connection

Rich random pointer
- Easy vs Simple
- Simple > 1 fold / ingen folder
- Kompleks > 2 eller flere folder
- Easy > Tæt på > Nemt at få fat i
- Complect -> Complecting
- Knitted castle problem
- parens are hard -> method( data more-data) -> (method data more-data)

Jarppe
- It is the State! You are doing it wrong


--
- [Rich Hickey - Simple made Easy](https://www.youtube.com/watch?v=LKtk3HCgTa8)
- [Jarppe Lansio - First 6 years of a Clojure Project](https://www.youtube.com/watch?v=WtdegIqQbrg)
- [Kyle Kingsbury - Jepsen 9: A Fsyncing Feeling](https://www.youtube.com/watch?v=tRc0O9VgzB0&feature=emb_title)
- [Bruce Hauman - Developing ClojureScript with Figwheel](https://www.youtube.com/watch?v=j-kj2qwJa_E&t=395s)
-- 
- [Mark Bastian - Bottom up vs top down design](https://www.youtube.com/watch?v=Tb823aqgX_0&list=PLItmZRDqBi-hwXovVX1sRkAoSdfsaz1aq&index=18)
- [Snowden - Dealing with unanticipated needs](https://www.youtube.com/watch?v=xYqWREPb3Lc&list=PLItmZRDqBi-hwXovVX1sRkAoSdfsaz1aq&index=19) 
--
- [Moseley & Marks - Out of the Tarpit](http://curtclifton.net/papers/MoseleyMarks06a.pdf)
- [Peter Norvig Design Patterns](https://norvig.com/design-patterns/design-patterns.pdf)
- [Mishadoff - Clojure Design Patterns](http://mishadoff.com/blog/clojure-design-patterns/)
- [Paul Graham - Beating the Averages](http://www.paulgraham.com/avg.html)
--

- Hvordan lærte i at programmere? 
Martin:  PHP, C#, JavaScript, TS (jeg har glemt noget her)
Stensig : C , C++ , Java 
Anders Java, C#, F#, Scala, C#
Chris: Scriptz, Java, C# =
Kongen: ? han sagde faktisk ikke noget :O