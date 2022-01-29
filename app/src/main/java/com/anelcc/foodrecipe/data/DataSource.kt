package com.anelcc.foodrecipe.data

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<Recipe>{
            val list = ArrayList<Recipe>()
            list.add(
                Recipe(
                    "Today make your happy!",
                    "Test this recipe!\r\n\r\nShare with your family or friends!",
                    "https://foodish-api.herokuapp.com/images/butter-chicken/butter-chicken15.jpg",
                    "By: Anel"
                )
            )
            list.add(
                Recipe(
                    "Time to be creative in the kitchen!",
                    "You need work hard to enjoy this",
                    "https://foodish-api.herokuapp.com/images/rice/rice22.jpg",
                    "By: Howard"
                )
            )

            list.add(
                Recipe(
                    "Don't be hungry",
                    "Follow this recipe and you will be wondering",
                    "https://foodish-api.herokuapp.com/images/samosa/samosa12.jpg",
                    "By: Anel"
                )
            )
            list.add(
                Recipe(
                    "Food ready in home",
                    "More easy is not possible",
                    "https://foodish-api.herokuapp.com/images/dosa/dosa29.jpg",
                    "By: Ramon"
                )
            )
            list.add(
                Recipe(
                    "Pasta, pasta, pasta",
                    "Bting the italian flavor in your table",
                    "https://foodish-api.herokuapp.com/images/pasta/pasta26.jpg",
                    "By: Elizabeth"
                )
            )
            list.add(
                Recipe(
                    "Work Life Balance for Software Developers",
                    "What kind of hobbies do software developers have? It sounds like many software developers don't have a lot of hobbies and choose to focus on work. Is that a good idea?",
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/work_life_balance.png",
                    "By: Kitchen.com"
                )
            )
            list.add(
                Recipe(
                    "Full Stack Web Developer - Nicholas Olsen",
                    "In this podcast I interviewed the Fullsnack Developer (AKA Nicholas Olsen).\\r\\n\\r\\nNicholas is many things. What I mean by that is, he's good at many things.\\r\\n\\r\\n1. He’s an entrepreneur\\r\\n\\r\\n2. Web developer\\r\\n\\r\\n3. Artist\\r\\n\\r\\n4. Graphic designer\\r\\n\\r\\n5. Musician (drums)\\r\\n\\r\\n6. Professional BodyBuilder.",
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/fullsnack_developer.png",
                    "By: Cupcakes.com"
                )
            )
            list.add(
                Recipe(
                    "Have fun in the kitchen",
                    "Peperoni, salami, cheese and more...",
                    "https://foodish-api.herokuapp.com/images/pizza/pizza46.jpg",
                    "By: the cookers "
                )
            )
            list.add(
                Recipe(
                    "Sweetie today...",
                    "Kids will love you all time",
                    "https://foodish-api.herokuapp.com/images/dessert/dessert3.jpg",
                    "by: mitch"
                )
            )
            return list
        }
    }
}