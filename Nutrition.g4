grammar Nutrition;


calculate
    : query
    ;

query: recipe macros?
	| item macros?
	;

recipe: RECIPE':' ingredients+;
item: ITEM':' ingredients;
//''
//seperate paths for recipe and a single item calculation

ingredients:  measurements 'OF' name+
            ;
//usage of "OF" as a seperator between measurement, since source close to plain-english, this reduce ambiguity
//name+ can anticipate name name name, and when visitation comes, need to collect the names!!

measurements: value '('units')'
            ;
//might change so it takes two types, the 3/4 and the 90, so int as value or 3/4 as value ID...



units: ID;

name: ID;


value: FRACTION 
    | INT;
//bit repetitive, but during semantic analysis, these will be accessed through there context of parent nodes!



macros : MACROS'=>'(types)+
	   ;

types : PROTEIN
      | CARBS
      | FATS
      | CALORIES
      ;


RECIPE: 'Recipe';
ITEM : 'Item' ;
MACROS : 'Macros';
PROTEIN : 'Protein';
CARBS: 'Carbs';
FATS: 'Fats';
CALORIES: 'Calories';
FRACTION: [1-9][1-9]*'/'[1-9][1-9]*;
ID: [a-zA-Z][a-zA-Z]*; //(Measurements Validity and food) Handle multi word IDS!
INT : [0-9][0-9]*;
WS  : [ \t\r\n]+ -> skip ;
