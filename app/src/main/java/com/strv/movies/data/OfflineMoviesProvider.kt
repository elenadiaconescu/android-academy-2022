package com.strv.movies.data

import com.strv.movies.model.*
import com.strv.movies.model.Collection

object OfflineMoviesProvider {
    fun getMovies(): List<Movie> {
        return listOf(
            Movie(
                634649,
                "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                false,
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "2021-12-15",
                listOf(28, 12, 878),
                "Spider-Man: No Way Home",
                "en",
                "Spider-Man: No Way Home",
                "/iQFcwSGbZXMkeyKrxbPnwnRo5fl.jpg",
                6260.858,
                8885,
                false,
                8.3
            ),
            Movie(
                414906,
                "/74xTEgt7R36Fpooo50r9T25onhq.jpg",
                false,
                "In his second year of fighting crime, Batman uncovers corruption in Gotham City that connects to his own family while facing a serial killer known as the Riddler.",
                "2022-03-01",
                listOf(80, 9648, 53),
                "The Batman",
                "en",
                "The Batman",
                "/5P8SmMzSNYikXpxil6BYzJ16611.jpg",
                4517.934,
                1035,
                false,
                8.1,
            ),
            Movie(
                568124,
                "/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg",
                false,
                "The tale of an extraordinary family, the Madrigals, who live hidden in the mountains of Colombia, in a magical house, in a vibrant town, in a wondrous, charmed place called an Encanto. The magic of the Encanto has blessed every child in the family with a unique gift from super strength to the power to heal—every child except one, Mirabel. But when she discovers that the magic surrounding the Encanto is in danger, Mirabel decides that she, the only ordinary Madrigal, might just be her exceptional family's last hope.",
                "2021-11-24",
                listOf(16, 35, 10751, 14),
                "Encanto",
                "en",
                "Encanto",
                "/3G1Q5xF40HkUBJXxt2DQgQzKTp5.jpg",
                2813.474,
                5044,
                false,
                7.7,
            ),
            Movie(
                476669,
                "/aq4Pwv5Xeuvj6HZKtxyd23e6bE9.jpg",
                false,
                "As a collection of history's worst tyrants and criminal masterminds gather to plot a war to wipe out millions, one man must race against time to stop them.",
                "2021-12-22",
                listOf(28, 12, 53, 10752),
                "The King's Man",
                "en",
                "The King's Man",
                "/oQPbZ5e6J9fuAyv4Gl0mMZMIyPI.jpg",
                2393.102,
                1761,
                false,
                7.0
            ),
            Movie(
                646385,
                "/kZNHR1upJKF3eTzdgl5V8s8a4C3.jpg",
                false,
                "Twenty-five years after a streak of brutal murders shocked the quiet town of Woodsboro, a new killer has donned the Ghostface mask and begins targeting a group of teenagers to resurrect secrets from the town’s deadly past.",
                "2022-01-12",
                listOf(27, 9648, 53),
                "Scream",
                "en",
                "Scream",
                "/usaZV7KB6Man9Rm9TyDAeQf7uVD.jpg",
                2112.147,
                885,
                false,
                6.9
            ),
            Movie(
                753232,
                "/mvCVaas7FkRV8uvyIJl1ANdT28k.jpg",
                false,
                "An elite DEA agent returns home after a failed mission when his family makes an unexpected discovery in their house – a stash of money worth $3 million. They soon face the danger and threat of a newly released criminal and his crew, who will do whatever it takes to retrieve the money, including kidnap the agent’s daughters. Stakes are high and lives are at risk in this head-to-head battle as the agent stops at nothing to protect his family against the money-hungry criminals.",
                "2022-01-07",
                listOf(28, 80, 53),
                "The Commando",
                "en",
                "The Commando",
                "/pnZ9NMxRqbcJ2dPNROIoregruv5.jpg",
                2224.556,
                26,
                false,
                6.9
            ),
            Movie(
                890656,
                "/3cccEF9QZgV9bLWyupJO41HSrOV.jpg",
                false,
                "A revenge mission becomes a fight to save the world from an ancient threat when superpowered assassin Kai tracks a killer to Bangkok.",
                "2022-02-17",
                listOf(28, 80, 14),
                "Fistful of Vengeance",
                "en",
                "Fistful of Vengeance",
                "/wMUPT99gw6IB9OVvC46rF8wHIRt.jpg",
                2047.769,
                109,
                false,
                5.3
            ),
            Movie(
                800510,
                "/okNgwtxIWzGsNlR3GsOS0i0Qgbn.jpg",
                false,
                "A tech worker with agoraphobia discovers recorded evidence of a violent crime but is met with resistance when she tries to report it. Seeking justice, she must do the thing she fears the most: she must leave her apartment.",
                "2022-02-10",
                listOf(53),
                "Kimi",
                "en",
                "Kimi",
                "/mruT954ve6P1zquaRs6XG0hA5k9.jpg",
                2039.86,
                201,
                false,
                6.3
            ),
            Movie(
                774825,
                "/zzXFM4FKDG7l1ufrAkwQYv2xvnh.jpg",
                false,
                "The fearless one-eyed weasel Buck teams up with mischievous possum brothers Crash & Eddie as they head off on a new adventure into Buck's home: The Dinosaur World.",
                "2022-01-21",
                listOf(16, 35, 12, 10751),
                "The Ice Age Adventures of Buck Wild",
                "en",
                "The Ice Age Adventures of Buck Wild",
                "/eG0oOQVsniPAuecPzDD1B1gnYWy.jpg",
                1788.551,
                728,
                false,
                7.2
            ),
            Movie(
                524434,
                "/bcCBq9N1EMo3daNIjWJ8kYvrQm6.jpg",
                false,
                "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
                "2021-11-03",
                listOf(878),
                "Eternals",
                "en",
                "Eternals",
                "/c6H7Z4u73ir3cIoCteuhJh7UCAR.jpg",
                1912.707,
                4705,
                false,
                7.2
            ),
            Movie(
                597208,
                "/680klE0dIreQQOyWKFgNnCAJtws.jpg",
                false,
                "An ambitious carnival man with a talent for manipulating people with a few well-chosen words hooks up with a female psychiatrist who is even more dangerous than he is.",
                "2021-12-02",
                listOf(80, 18, 53),
                "Nightmare Alley",
                "en",
                "Nightmare Alley",
                "/mqDnDhG5N6fn1H4MKQqr8E5wfeK.jpg",
                1861.657,
                943,
                false,
                7.1
            ),
            Movie(
                632727,
                "/meRIRfADEGVo65xgPO6eZvJ0CRG.jpg",
                false,
                "In this sequel, influencers looking to breathe new life into a Texas ghost town encounter Leatherface, an infamous killer who wears a mask of human skin.",
                "2022-02-18",
                listOf(27),
                "Texas Chainsaw Massacre",
                "en",
                "Texas Chainsaw Massacre",
                "/aTSA5zMWlVFTYBIZxTCMbLkfOtb.jpg",
                1737.275,
                518,
                false,
                5.1
            ),
            Movie(
                768744,
                "/4NUzcKtYPKkfTwKsLjwNt8nRIXV.jpg",
                false,
                "A mysterious group called Humarize strongly believes in the Quirk Singularity Doomsday theory which states that when quirks get mixed further in with future generations, that power will bring forth the end of humanity. In order to save everyone, the Pro-Heroes around the world ask UA Academy heroes-in-training to assist them and form a world-classic selected hero team. It is up to the heroes to save the world and the future of heroes in what is the most dangerous crisis to take place yet in My Hero Academia.",
                "2021-08-06",
                listOf(16, 28, 14, 12),
                "僕のヒーローアカデミア THE MOVIE ワールド ヒーローズ ミッション",
                "en",
                "My Hero Academia: World Heroes' Mission",
                "/cugmVwK0N4aAcLibelKN5jWDXSx.jpg",
                1840.849,
                97,
                false,
                7.4
            ),
            Movie(
                871799,
                "/wYihSXWYqN8Ejsdut2P1P0o97N0.jpg",
                false,
                "Detective Breslin crosses paths with Calloway, a ruthless hacker desperate to find his wife, who has been kidnapped by a drug cartel. When Calloway escapes police custody, Breslin joins forces with a no-nonsense female cop to reclaim his prisoner. But is Calloway’s crime-boss father somehow involved in this explosive situation?",
                "2022-02-18",
                listOf(28, 80, 53),
                "Pursuit",
                "en",
                "Pursuit",
                "/yKnjIWNIVECfMoKy1ayl68vX6qj.jpg",
                1968.969,
                15,
                false,
                6.2
            ),
            Movie(
                585083,
                "/teCy1egGQa0y8ULJvlrDHQKnxBL.jpg",
                false,
                "When Van Helsing's mysterious invention, the \"Monsterfication Ray,\" goes haywire, Drac and his monster pals are all transformed into humans, and Johnny becomes a monster. In their new mismatched bodies, Drac and Johnny must team up and race across the globe to find a cure before it's too late, and before they drive each other crazy.",
                "2022-02-25",
                listOf(16, 10751, 14, 35, 12),
                "Hotel Transylvania: Transformania",
                "en",
                "Hotel Transylvania: Transformania",
                "/qBLEWvJNVsehJkEJqIigPsWyBse.jpg",
                1693.653,
                274,
                false,
                7.0
            ),
            Movie(
                512195,
                "/q4kemt46zXXMwIEo7pDH1yKtr1p.jpg",
                false,
                "An Interpol-issued Red Notice is a global alert to hunt and capture the world's most wanted. But when a daring heist brings together the FBI's top profiler and two rival criminals, there's no telling what will happen.",
                "2021-11-04",
                listOf(28, 35, 80, 53),
                "Red Notice",
                "en",
                "Red Notice",
                "/dK12GIdhGP6NPGFssK2Fh265jyr.jpg",
                1780.285,
                3187,
                false,
                6.8
            ),
            Movie(
                803114,
                "/i0z8g2VRZP3dhVvvSMilbOZMKqR.jpg",
                false,
                "A couple on a romantic getaway find themselves stranded at sea when a tropical storm sweeps away their villa. In order to survive, they are forced to fight the elements, while sharks circle below.",
                "2022-01-28",
                listOf(53),
                "The Requin",
                "en",
                "The Requin",
                "/eVSa4TpyXbOdk9fXSD6OcORJGtv.jpg",
                1647.62,
                65,
                false,
                4.6
            ),
            Movie(
                783461,
                "/onGdT8sYi89drvSJyEJnft97rOq.jpg",
                false,
                "When her boyfriend loses a mobster's cash, Savi races against the clock to save the day — if only she can break out of a curious cycle of dead ends.",
                "2022-02-04",
                listOf(28, 35, 80),
                "लूप लपेटा",
                "hi",
                "Looop Lapeta",
                "/kQM7o3NIkruIZLoQ9E2XzZQ8Ujl.jpg",
                1565.271,
                29,
                false,
                5.9
            ),
            Movie(
                438695,
                "/aWeKITRFbbwY8txG5uCj4rMCfSP.jpg",
                false,
                "Buster and his new cast now have their sights set on debuting a new show at the Crystal Tower Theater in glamorous Redshore City. But with no connections, he and his singers must sneak into the Crystal Entertainment offices, run by the ruthless wolf mogul Jimmy Crystal, where the gang pitches the ridiculous idea of casting the lion rock legend Clay Calloway in their show. Buster must embark on a quest to find the now-isolated Clay and persuade him to return to the stage.",
                "2021-12-01",
                listOf(16, 35, 10751, 10402),
                "Sing 2",
                "en",
                "Sing 2",
                "/tutaKitJJIaqZPyMz7rxrhb4Yxm.jpg",
                1427.712,
                2152,
                false,
                8.2
            ),
            Movie(
                801071,
                "/3Ib8vlWTrAKRrTWUrTrZPOMW4jp.jpg",
                false,
                "When a vintage Jack-in-the-box is opened by a dying woman, she enters into a deal with the demon within that would see her illness cured in return for helping it claim six innocent victims.",
                "2022-01-03",
                listOf(27),
                "The Jack in the Box: Awakening",
                "en",
                "The Jack in the Box: Awakening",
                "/xHRabofjmMGoIV3mb6xgy4nwOcS.jpg",
                1345.061,
                42,
                false,
                5.4
            )
        )
    }

    fun getMovieDetail(movieId: Int): MovieDetail {
        return MovieDetail(
            634649,
            false,
            "/iQFcwSGbZXMkeyKrxbPnwnRo5fl.jpg",
            Collection(
                531241,
                "Spider-Man (Avengers) Collection",
                "",
                "/nogV4th2P5QWYvQIMiWHj4CFLU9.jpg", "/AvnqpRwlEaYNVL6wzC4RN94EdSd.jpg"
            ),
            200000000,
            listOf(Genre(28, "Action"), Genre(12, "Adventure"), Genre(878, "Science Fiction")),
            "https://www.spidermannowayhome.movie",
            "tt10872600",
            "en",
            "Spider-Man: No Way Home",
            "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
            13287.383,
            "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
            listOf(
                ProductionCompany(
                    420,
                    "/hUzeosd33nzE5MCNsZxCGEKTXaQ.png",
                    "Marvel Studios",
                    "US"
                ),
                ProductionCompany(
                    84041,
                    "/nw4kyc29QRpNtFbdsBHkRSFavvt.png",
                    "Pascal Pictures",
                    "US"
                ),
                ProductionCompany(5, "/71BqEFAF4V3qjjMPCpLuyJFB9A.png", "Columbia Pictures", "US")
            ),
            listOf(
                ProductionCountry("US", "United States of America")
            ),
            "2021-12-15", 1876685954, 148,
            listOf(
                SpokenLanguage("en", "English"),
                SpokenLanguage("tl", "Tagalog")
            ),
            "Released", "The Multiverse unleashed.", "Spider-Man: No Way Home", false, 8.3, 9615
        )
    }


    fun getTrailer(movieId: Int): Trailer {
        return Trailer(
            "en",
            "US",
            "Official Trailer",
            "JfVOs4VSpmA",
            "YouTube",
            1080,
            "Trailer",
            true,
            "2021-11-17T01:30:05.000Z",
            "61945b8a4da3d4002992d5a6"
        )
    }
}