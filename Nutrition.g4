Grammar Nutrition;


Calculate: Items;

items: recipe macros?
	| item macros?
	;

recipe: RECIPE ingredients+;
item: ITEM ingredients;

//seperate paths for recipe and a single item calculation

ingredients:  measurements ‘OF’ name+
            ;
//usage of "OF" as a seperator between measurement, since source close to plain-english, this reduce ambiguity
//name+ can anticipate name name name, and when visitation comes, need to collect the names!!

measurements: value ‘(‘units’)’
            ;

units: value;

name: value;

value: ID;
//bit repetitive, but during semantic analysis, these will be accessed through there context of parent nodes!


macros : MACROS types*
	   ;

types : PROTEIN
      | CARBS
      | FATS
      | CALORIES
      ;



ID[a-zA-Z][a-zA-Z]*; //(Measurements Validity and food) Handle multi word IDS!
INT[0-9];
RECIPE: ‘Recipe’;
ITEM : ‘Item’;
MACROS : ‘Macros’;
PROTEIN : ‘Protein’;
CARBS: ‘Carbs’;
FATS: ‘Fats’;
CALORIES: ‘Calories’;
WS  : [ \t\r\n]+ -> skip ;































ID[a-zA-Z][a-zA-Z]*(’ ‘[a-zA-Z][a-zA-Z])*; //(Measurements Validity and food)
INT[0-9];
RECIPE: ‘Recipe’;
ITEM : ‘Item’;
MACROS : ‘Macros’;
PROTEIN : ‘Protein’;
CARBS: ‘Carbs’;
FATS: ‘Fats’;
CALORIES: ‘Calories’;

