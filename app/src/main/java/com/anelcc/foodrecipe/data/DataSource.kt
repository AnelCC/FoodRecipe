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
                    "Beef Stew Recipes",
                    "Thick, hearty, classic beef stew recipes. Get ideas for the slow cooker or stovetop, with tips and videos on making the perfect stew.",
                    "https://foodish-api.herokuapp.com/images/burger/burger53.jpg",
                    "By: Kitchen.com"
                )
            )
            list.add(
                Recipe(
                    "Spice up dinners",
                    "Looking for inspiration on how to spice up dinners? We have compiled this versatile collection of showstopping ",
                    "https://foodish-api.herokuapp.com/images/rice/rice29.jpg",
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
                    "by: allrecipes.com"
                )
            )
            list.add(
                Recipe(
                    "Sorry.. Something went wrong",
                    "Kids will love you all time",
                    "",
                    "by: myrecipes.com"
                )
            )
            return list
        }
    }
}