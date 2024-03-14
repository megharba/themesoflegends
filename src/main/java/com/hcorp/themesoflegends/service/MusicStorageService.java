package com.hcorp.themesoflegends.service;

import com.hcorp.themesoflegends.dto.MusicDto;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MusicStorageService {
    //registre de musique
    private final List<MusicDto> musics = new ArrayList<>();

    //constructeur
    public MusicStorageService() {
        musics.add(new MusicDto(
                "Q3DHq7VjBjnQqQZS6gFy",
                "renata glasc",
                "2022",
                "CHAMPION",
                List.of("renata")
        ));
        musics.add(new MusicDto(
                "PIQzCI7f0hIeQIY0UAKT",
                "zeri",
                "2022",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "RszAKanEdpGSIRA8WKS4",
                "festival lunaire",
                "2022",
                "SKIN",
                List.of("porcelaine")
        ));
        musics.add(new MusicDto(
                "Bt3cWUFOJWTXOyTCcdR0",
                "caitlyn",
                "2021",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "dIeRPhhQZl64IH0WHNUm",
                "dracomanciens",
                "SKIN",
                "2021",
                List.of("dragon", "dracomancien")
        ));
        musics.add(new MusicDto(
                "YYPi89zzBHuE1hNPMmvk",
                "vex",
                "2021",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "BGw2qRgIOMFtv7SpK1GF",
                "mondial",
                "2021",
                "EVENT",
                List.of("make break")
        ));
        musics.add(new MusicDto(
                "ExBUtQw63x81AaQWHYPn",
                "assemblé",
                "2021",
                "SKIN",
                List.of("assemblée", "assemblee")
        ));
        musics.add(new MusicDto(
                "QUxBz6U2LK1mGURyO7DK",
                "akshan",
                "2021",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "uDqg5vgbIqBMrUWHY9KQ",
                "sentinelles de la lumière",
                "2021",
                "EVENT",
                List.of("sentinelles de la lumiere", "sentinelle de la lumiere", "sentinelle de la lumière")
        ));
        musics.add(new MusicDto(
                "QQH4lSNHc3VXe8dWzojX",
                "dr. mundo",
                "2021",
                "CHAMPION",
                List.of("dr mundo", "mundo", "docteur mundo")
        ));
        musics.add(new MusicDto(
                "3j5eiCDCY2tmNK8DRBG2",
                "projet",
                "2021",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "nqnZQTEvagZLa3dPzB0l",
                "gwen",
                "2021",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "5xQNUxoeJwntjnWtNBpk",
                "astro groove",
                "2021",
                "SKIN",
                List.of("space groove")
        ));
        musics.add(new MusicDto(
                "8Y4xOdYoere0xdKM0WeT",
                "festival lunaire",
                "2021",
                "SKIN",
                List.of("bête Lunaire", "bete lunaire")
        ));
        musics.add(new MusicDto(
                "kwvx8V4OFvRTdh1ncW86",
                "viego",
                "2021",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "mB3uUmMkOCIxaVHFkGAE",
                "rell",
                "2020",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "B80TWUvjsAstmV4W8NkF",
                "reines du combat",
                "2020",
                "SKIN",
                List.of("reine du combat")
        ));
        musics.add(new MusicDto(
                "10qwEEcN9KSpNH96DO7x",
                "séraphine",
                "2020",
                "CHAMPION",
                List.of("seraphine")
        ));
        musics.add(new MusicDto(
                "SCbHZ3xkQQ13okXmKnOC",
                "samira",
                "2020",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "yvq8soLPcaxiDTRpaZD4",
                "mondial",
                "2020",
                "EVENT",
                List.of("take over")
        ));
        musics.add(new MusicDto(
                "XI6uLbn34FurFt57dAxT",
                "psychoguerriers",
                "2020",
                "SKIN",
                List.of("psy ops", "psyOps", "psycho guerriers", "psychoguerrier", "psycho guerrier")
        ));
        musics.add(new MusicDto(
                "sHTP5llhobExufLTeliQ",
                "yone",
                "2020",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "ywZkFHHXPT2s85819QyN",
                "lillia",
                "2020",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "AfMgslPtW5ctlUyrq8bB",
                "volibear",
                "2020",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "EKXXJxggcEyIPk9pvE1B",
                "fiddlesticks",
                "2020",
                "CHAMPION",
                List.of("fiddle sticks")
        ));
        musics.add(new MusicDto(
                "rcEICnKJpELb6itZp7Mo",
                "sett",
                "2020",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "JRMbUgafICAlW1J8QPpU",
                "aphelios",
                "2019",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "rlA4odsowRGANGNcVqgn",
                "clash",
                "2019",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "PcCuvHWz39HD2bItAd2N",
                "senna",
                "2019",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "x4k2CxPDV1PQ1BEilkb2",
                "mondial",
                "2019",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "L8fpy98G2eEN7JqYOChv",
                "pantheon",
                "2019",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "CddNS8nJm909hs3aDSuI",
                "arcade",
                "2019",
                "SKIN",
                List.of("ultracombo", "ultra combo", "arcade ultra combo", "arcade ultracombo")
        ));
        musics.add(new MusicDto(
                "ywmAyK0R9jDKOsl15xtM",
                "jhin démiurge cosmique",
                "2019",
                "SKIN",
                List.of("jhin pulsar sombre")
        ));
        musics.add(new MusicDto(
                "CPoPr5oZpzDTShKSZ7Lx",
                "qiyana",
                "2019",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "QNqHQb1nRbludskbwCrA",
                "mordekaiser",
                "2019",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "RXVHj8IBI675EjD0mEK5",
                "académie de combat",
                "2019",
                "SKIN",
                List.of("msi")
        ));
        musics.add(new MusicDto(
                "AeKYzSQkUEB4FgfeMqH4",
                "msi",
                "2019",
                "EVENT",
                List.of("msi")
        ));
        musics.add(new MusicDto(
                "2xvQt8U8T9Vt6YN4tKra",
                "yuumi",
                "2019",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "WBVpN2f69uUlbyOQsTy4",
                "zed fléau galactique",
                "2019",
                "SKIN",
                List.of("zed odyssée", "zed fleau galactique", "zed de odyssee")
        ));
        musics.add(new MusicDto(
                "YfBLJMzA6gjh8WvJv28s",
                "chat vs chien",
                "2019",
                "SKIN",
                List.of("chat et chien", "chien et chat", "chat vs chien")
        ));
        musics.add(new MusicDto(
                "5d34a2jTdSuqomImSyjA",
                "kayle et morgana",
                "2019",
                "CHAMPION",
                List.of("kayle", "morgana", "morgana et kayle", "morgana kayle", "kayle morgana")
        ));
        musics.add(new MusicDto(
                "N1U3XRIFertvJdYPZojp",
                "festival lunaire",
                "2019",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "xdODZsvklLAEzWp953qD",
                "saison",
                "2019",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "cvTYWpUpWvM56RMX0Ztc",
                "sylas",
                "2019",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "o1DjVqXGzVea6cTKGl2D",
                "noël",
                "2018",
                "SKIN",
                List.of("noel")
        ));
        musics.add(new MusicDto(
                "7gZ3LOEMdSTQgU9tM7V2",
                "neeko",
                "2018",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "C0rh9WoYDscXdtGtpCDq",
                "leona éclipse solaire et lunaire",
                "2018",
                "SKIN",
                List.of("leona éclipse solaire", "leona éclipse lunaire", "leona eclipse solaire", "leona eclipse lunaire", "leona eclipse solaire et lunaire")
        ));
        musics.add(new MusicDto(
                "FNb1CxvCogG3mWofOWsx",
                "k/da pop/stars",
                "2018",
                "SKIN",
                List.of("k/da", "kda", "kda pop/stars", "kda popstars", "pop/stars", "popstars")
        ));
        musics.add(new MusicDto(
                "Xqh5vZIypzgQY7ZQt2iJ",
                "ezreal pulsefire",
                "2018",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "yPiXgLoiwuEpz5yiANus",
                "mondial ",
                "2018",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "xfJFpD9WtkRSvIJcT96Q",
                "odyssée",
                "2018",
                "SKIN",
                List.of("odyssee")
        ));
        musics.add(new MusicDto(
                "8P0byIB39LAA7OYZlFdT",
                "nunu et willump",
                "2018",
                "CHAMPION",
                List.of("nunu", "willump", "nunu et william")
        ));
        musics.add(new MusicDto(
                "LAgQZxnEhhaqIEIWeThF",
                "akali",
                "2018",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "zhbsruZoR5iSDG5qLjC2",
                "cho'gath pulsar sombre",
                "2018",
                "SKIN",
                List.of("chogath Pulsar Sombre")
        ));
        musics.add(new MusicDto(
                "ncoe7mbvORrpWpk2le7K",
                "rift rivals",
                "2018",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "PbEKGJp6yZLkvMgPVZQ7",
                "aatrox",
                "2018",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "WswyYUBp1ktBqPSuAfRE",
                "darius dieu roi",
                "2018",
                "SKIN",
                List.of("vs", "vs Darius")
        ));
        musics.add(new MusicDto(
                "5K6QLkPUpFqUyKziixfu",
                "garen dieu roi",
                "2018",
                "SKIN",
                List.of("vs", "vs Garen")
        ));
        musics.add(new MusicDto(
                "ErQirh8dOc028qb2tttf",
                "pyke",
                "2018",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "v02qDrm1Ikca0r3H1ewb",
                "msi",
                "2018",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "eVdGut6DxDR0iK8PmOdO",
                "irelia",
                "2018",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "nuKUaDEALrmmBe5QYCrE",
                "miss fortune déesse des flingues",
                "2018",
                "SKIN",
                List.of("miss fortune deesse des flingues", "miss fortune deesse des flingue", "miss fortune déesse des flingue")
        ));
        musics.add(new MusicDto(
                "dsddoqdHA0sLLRR0NiLD",
                "kai'sa",
                "2018",
                "CHAMPION",
                List.of("kaisa")
        ));
        musics.add(new MusicDto(
                "RKbQ3KqHuljnjwF7AbzW",
                "festival lunaire",
                "2018",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "MwbSuP507TnTeUmUBpOV",
                "swain",
                "2018",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "NH9s96uJM2JP4cSdc1s6",
                "saison",
                "2018",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "yaCQJOfmeE6ikb60kYN8",
                "noël",
                "2017",
                "SKIN",
                List.of("noel")
        ));
        musics.add(new MusicDto(
                "XrmgQEMkrfrb3bBWyFoi",
                "all-star",
                "2017",
                "EVENT",
                List.of("all star", "allstar")
        ));
        musics.add(new MusicDto(
                "KBFUhzxGQSUJXR1OTz6z",
                "honneur",
                "2017",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "YSVdKJLBHdSe7mkHk5L9",
                "gardiens des étoiles",
                "2017",
                "SKIN",
                List.of("gardien des etoiles", "gardiennes des etoiles", "gardienne des etoiles")
        ));
        musics.add(new MusicDto(
                "hy95m7HwdV6MEAp5S4AM",
                "msi",
                "2016",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "LElnRCkFcjFGCypZQi3R",
                "noël ",
                "2015",
                "SKIN",
                List.of("noel")
        ));
        musics.add(new MusicDto(
                "xpGHfG89VWeVJsBZoIYk",
                "mondial",
                "2015",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "FvWjF93Ga82ale60WqYs",
                "orianna merveille hivernale",
                "2017",
                "SKIN",
                List.of("orianna noel", "orianna noël")
        ));
        musics.add(new MusicDto(
                "68H9CxbwkiWxS7uYXnhQ",
                "darius roi du dunk",
                "2017",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "p11dtPxCglFwqP9Bnsrj",
                "zoé",
                "2017",
                "CHAMPION",
                List.of("zoe")
        ));
        musics.add(new MusicDto(
                "s6R76al69gMNYg6eeRND",
                "projet",
                "2017",
                "SKIN",
                List.of("projet", "projet chasseur")
        ));
        musics.add(new MusicDto(
                "8JnPtCJBkqaWjjpvpxaj",
                "noël",
                "2016",
                "SKIN",
                List.of("noel")
        ));
        musics.add(new MusicDto(
                "RiSdfeSmfrJ6F1UHrZ1c",
                "arcade",
                "2017",
                "SKIN",
                List.of("boss de combat")
        ));
        musics.add(new MusicDto(
                "b2JzjEfEAwJ1LoYvGuuO",
                "festival lunaire",
                "2017",
                "SKIN",
                List.of("royaume en guerre")
        ));
        musics.add(new MusicDto(
                "Ys9xXQXC99NS5M46hxhq",
                "section Omega",
                "2017",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "Y3EAmY4NMX0LDCFtuCIE",
                "caitlyn pulsefire",
                "2017",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "KDYBlfhZrxccqRc1CVpR",
                "lee sin poing divin",
                "2017",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "ZVfLn0oNi1U56ztijRpu",
                "saison",
                "2017",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "ibUdSeydVJBV0ttIvbfB",
                "rune",
                "2017",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "kFUiwFBLxfLDGQGz1JFP",
                "sion mecha zéro",
                "2017",
                "SKIN",
                List.of("sion mecha zero", "malphite mecha")
        ));
        musics.add(new MusicDto(
                "JDsFqDX2zoZ3il73dsf1",
                "evelynn",
                "2017",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "CVsgqnTUNTEMyBnY6CHc",
                "ornn",
                "2017",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "B537hQILFAbWijRQc9YD",
                "mondial",
                "2017",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "Jjxtn26lwDLlkn72FP9u",
                "urgot",
                "2017",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "EWYTWGVl04gdaCDEAfc1",
                "kayn assassin de l'ombre",
                "2017",
                "CHAMPION",
                List.of("kayn assassin", "kayn bleu")
        ));
        musics.add(new MusicDto(
                "wPx6E9UhPEYLYuX3Tcqr",
                "kayn darkin",
                "2017",
                "CHAMPION",
                List.of("kayn rouge")
        ));
        musics.add(new MusicDto(
                "bu9i7dAZvj1O5a8DE1Bj",
                "yasuo vs riven",
                "2017",
                "SKIN",
                List.of("riven vs yasuo", "yasuo héraut de la nuit", "yasuo heraut de la nuit", "riven héraut de l'aube", "riven heraut de l'aube")
        ));
        musics.add(new MusicDto(
                "aDCfsRgMhdl3bz4IbuDu",
                "pulsar sombre",
                "2017",
                "SKIN",
                List.of("orianna pulsar sombre", "kha'zix pulsar sombre", "khazix pulsar sombre")
        ));
        musics.add(new MusicDto(
                "tfna66KDmFw9ot8qCTGO",
                "msi",
                "2017",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "bbZAe3xYFQP83t30R1wW",
                "xayah et rakan",
                "2017",
                "CHAMPION",
                List.of("rakan et xayah", "xayah", "rakan")
        ));
        musics.add(new MusicDto(
                "mlENcq8gUywg4tRn31Bk",
                "galio",
                "2017",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "89ufb5ojPqO443oFg2Uk",
                "xin zhao chasseur de dragon",
                "2017",
                "SKIN",
                List.of("xinzhao chasseur de dragon")
        ));
        musics.add(new MusicDto(
                "OinHH1BRK6ePaVbeIK53",
                "diana lune de sang",
                "2017",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "TZSJ7zy3SkHJvp3m6BTD",
                "warwick",
                "2017",
                "CHAMPION",
                List.of("vander")
        ));
        musics.add(new MusicDto(
                "7TKhTPXcnEaYpRJsCqVh",
                "camille",
                "2016",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "XgK9f8BQAZvaqS7Vj8dw",
                "all-star",
                "2016",
                "EVENT",
                List.of("all star", "allstar")
        ));
        musics.add(new MusicDto(
                "jikmqgLHEUZP2BNcKmCZ",
                "lux élémentaliste",
                "2016",
                "SKIN",
                List.of("lux elémentaliste", "lux élementaliste", "lux elementaliste")
        ));
        musics.add(new MusicDto(
                "jYwlhSVVKEOMhGJA2UEa",
                "halloween",
                "2016",
                "SKIN",
                List.of("conte de la faille", "teemo diablotin")
        ));
        musics.add(new MusicDto(
                "ubdqyrOBCkvSXPbe9LAY",
                "final mondial",
                "2016",
                "EVENT",
                List.of("final", "mondial")
        ));
        musics.add(new MusicDto(
                "h3YaUNgeuBvF5QhvVeAl",
                "gardiens des étoiles",
                "2016",
                "SKIN",
                List.of("gardien des etoiles", "gardiennes des etoiles", "gardienne des etoiles")
        ));
        musics.add(new MusicDto(
                "fpI28QRAEuVRuwLFhJbo",
                "ivern",
                "2016",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "14jIAIJazg3EUQB3fjCw",
                "mondial",
                "2016",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "rGPpidhpsjs6FE6lw9un",
                "yorick",
                "2016",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "tFGKSRxbx2WzDRqIjpQQ",
                "ahri arcade",
                "2016",
                "SKIN",
                List.of("arcade", "bit rush")
        ));
        musics.add(new MusicDto(
                "OYzz61DVCDgwHqxlq9QP",
                "kled",
                "2016",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "PVLelUeVwHVKXxCuV4Vc",
                "ashe Projet",
                "2016",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "LJrouHyhok5RKvkxk0kD",
                "ryze",
                "2016",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "SkqZoaqnZJDw92Rh7Npn",
                "thresh pulsar sombre",
                "2016",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "ihKyKviWD2bd12a6JP1A",
                "taliyah",
                "2016",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "hLFbM9itnB1x0hhXsD93",
                "taric",
                "2016",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "rudHEtLylyoLkJ3Y0Ts1",
                "1er avril",
                "2016",
                "SKIN",
                List.of("premier avril", "1 avril", "poisson d'avril")
        ));
        musics.add(new MusicDto(
                "Ao8aBtONWCtHHpqZzzNG",
                "aurelion sol",
                "2016",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "iydGQBjN0gcryyPAjJmC",
                "festival lunaire",
                "2016",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "aaKPMoDQtxjmMyQssIhF",
                "jhin",
                "2016",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "29q7PyaycZx7vTHDoJ0w",
                "saison",
                "2016",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "jO0NYvYeM0bOqjYl85WG",
                "poppy",
                "2015",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "e2TylUEeiVdsM0swbUde",
                "tristana dragonnière",
                "2015",
                "SKIN",
                List.of("trsitana dragonnier", "tristana dragonniere")
        ));
        musics.add(new MusicDto(
                "U5MS85OzSk2XaRvyLx1I",
                "illaoi",
                "2015",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "Cwo5Z3IJGohqSbHVk1Rq",
                "jinx tueuse de zombies",
                "2015",
                "SKIN",
                List.of("jinx chasseuse de zombies")
        ));
        musics.add(new MusicDto(
                "QJf0PaJMC5fQxnlVk1fw",
                "kindred",
                "2015",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "dIEEHJDmiqLhrnGBbhbt",
                "maître yi projet",
                "2015",
                "SKIN",
                List.of("maitre yi projet", "yi projet")
        ));
        musics.add(new MusicDto(
                "B7TVhifTpJ6lcuWyBjp9",
                "arcade",
                "2015",
                "SKIN",
                List.of("bit rush", "bitrush")
        ));
        musics.add(new MusicDto(
                "NzGxe7jmcjAlv95HpmCn",
                "gangplank",
                "2015",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "Dbmx0AtKXGbwpedziOiI",
                "capitaine Fortune",
                "2015",
                "CHAMPION",
                List.of("miss fortune")
        ));
        musics.add(new MusicDto(
                "RqbNFU6VJwLGy9rXB2tw",
                "capitaine gangplank",
                "2015",
                "CHAMPION",
                List.of("gangplank")
        ));
        musics.add(new MusicDto(
                "pIYRNrilbLBQ2iIeQrru",
                "twisted fate et graves",
                "2015",
                "CHAMPION",
                List.of("twisted fate", "grave", "grave et twisted fate")
        ));
        musics.add(new MusicDto(
                "sbU2votZzah6czsPe8b7",
                "tahm kench",
                "2015",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "AR3JWS7JXaWLMTISTxce",
                "ekko",
                "2015",
                "CHAMPION",
                List.of("court sur patte")
        ));
        musics.add(new MusicDto(
                "YRMEsNw9Ag1xW50Lr5WK",
                "urf",
                "2014",
                "EVENT",
                List.of("u.r.f", "ultra rapid fire")
        ));
        musics.add(new MusicDto(
                "xXXLvcA6geTaCitaQ5GG",
                "all-star",
                "2013",
                "EVENT",
                List.of("all star", "allstar")
        ));
        musics.add(new MusicDto(
                "d8nz6blTCz1JTdRX3L6E",
                "shurima",
                "2015",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "wegH8RZRjniao2sFFuZG",
                "kayle ailes éthérée",
                "2015",
                "SKIN",
                List.of("kayle ailes etheree")
        ));
        musics.add(new MusicDto(
                "NKPqiBW2rGe5obmkIES6",
                "dj sona éthérées",
                "2015",
                "SKIN",
                List.of("dj sona", "éthérées", "etherees", "dj sona etherees")
        ));
        musics.add(new MusicDto(
                "5hy7apPsOtJmKZYy3bca",
                "jinx pyrotechnicienne",
                "2015",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "YaTQYXBWo8VFHBcz3HqY",
                "zyra hantée",
                "2015",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "QgyWpYcYvD1VNVWthvX0",
                "final saison",
                "2015",
                "EVENT",
                List.of("final", "saison", "saison 3", "final saison 3", "saison 3 final", "saison final")
        ));
        musics.add(new MusicDto(
                "6Qe0a6nzjrmYkhFdl7R9",
                "piscine",
                "2015",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "5ubJZjBIVgH4P2DhCTvD",
                "football",
                "2015",
                "SKIN",
                List.of("foot", "légende du terrain")
        ));
        musics.add(new MusicDto(
                "FCzma2k0tRLD04Y3O8jX",
                "all-star",
                "2014",
                "EVENT",
                List.of("all star", "allstar")
        ));
        musics.add(new MusicDto(
                "SoGsEeih6kdsDSokkKqu",
                "mondial",
                "2015",
                "EVENT",
                List.of("saison 3", "mondial")
        ));
        musics.add(new MusicDto(
                "tb3wQURKIElDQMEx1KDG",
                "fiddlesticks friandise",
                "2015",
                "SKIN",
                List.of("fiddle sticks friandise")
        ));
        musics.add(new MusicDto(
                "X0GbXFpBiBM4tkCxj3C5",
                "faille de l'invocateur",
                "2015",
                "EVENT",
                List.of("faille")
        ));
        musics.add(new MusicDto(
                "eDYGGOXMv6DRVzo13P3C",
                "îles obscures",
                "2014",
                "EVENT",
                List.of("iles obscures")
        ));
        musics.add(new MusicDto(
                "MhU1CsZm9uVfA9qRH3TJ",
                "saison",
                "2014",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "Ajz5YHslgg8dpP2IFfDi",
                "noël",
                "2013",
                "SKIN",
                List.of("noel")
        ));
        musics.add(new MusicDto(
                "A3qoh4n7HHtGkEBlZR8i",
                "nasus infernal",
                "2015",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "oETODDYNuuYeO15KDJeo",
                "dj sona percutante",
                "2015",
                "SKIN",
                List.of("dj sona", "percutant", "percutante")
        ));
        musics.add(new MusicDto(
                "aMaJjc0ZswUZ0alg98V3",
                "saison",
                "2015",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "bLQiQQ8r4Rtc36DfgagV",
                "annie panda",
                "2014",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "4WJEZlRbjZG9cF6qv86X",
                "nocturne ethernum",
                "2015",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "uuMRmyeZDI0LxRQFC4tN",
                "cho'gath proto",
                "2014",
                "SKIN",
                List.of("chogath proto")
        ));
        musics.add(new MusicDto(
                "8NM8ew7b1AoEITzb2WeQ",
                "dj sona cinétique",
                "2015",
                "SKIN",
                List.of("dj sona", "cinétique", "cinetique", "dj sona cinetique")
        ));
        musics.add(new MusicDto(
                "dAm9SIPrxx4viYoJfN7F",
                "mondial",
                "2014",
                "EVENT", List.of()
        ));
        musics.add(new MusicDto(
                "n8wEyjDWk1KIwByhZCac",
                "rumble intergalactique",
                "2015",
                "SKIN",
                List.of("super rumble intergalactique")
        ));
        musics.add(new MusicDto(
                "v5AQZg2xmtvEmd9GqmS6",
                "udyr gardien des ésprits",
                "2015",
                "SKIN",
                List.of("udyr gardien des esprits")
        ));
        musics.add(new MusicDto(
                "RFaqqpHR3nzgReewWgtU",
                "janna miss météo",
                "2014",
                "SKIN",
                List.of("Janna miss meteo")
        ));
        musics.add(new MusicDto(
                "VJNudaXzOehOpfDp8kht",
                "teemo section omega",
                "2015",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "GLj6WNGI9XnZJe0Zpnha",
                "festival lunaire",
                "2014",
                "SKIN", List.of()
        ));
        musics.add(new MusicDto(
                "NIK2LZQYbnGKBVHTOmny",
                "galio cerbère",
                "2012",
                "SKIN",
                List.of("galio cerbere")
        ));
        musics.add(new MusicDto(
                "oSZTRivPl17g8jTmN3vJ",
                "urf",
                "2015",
                "EVENT",
                List.of("u.r.f", "ultra rapid fire")
        ));
        musics.add(new MusicDto(
                "jck93xAMQHPwYNXPcl3H",
                "bard",
                "2015",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "iEinH66umt6gd3KbKiZM",
                "rek'sai",
                "2014",
                "CHAMPION",
                List.of("reksai")
        ));
        musics.add(new MusicDto(
                "fYfb1D0YKViF61HU10wn",
                "kalista",
                "2014",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "WOgBTPtPvccMHmb0Epb6",
                "sion",
                "2014",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "SDtXMgopHm73Hgt8tk6o",
                "azir",
                "2015",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "IluuUbRbU2jB7h9S8SNx",
                "gnar",
                "2014",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "y2A4G3s3NKWzKAgsyMt2",
                "braum",
                "2015",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "TNzCpfYFxCAgRZfvQaJv",
                "vel'koz",
                "2014",
                "CHAMPION",
                List.of("velkoz")
        ));
        musics.add(new MusicDto(
                "SKUnqgU9ouCDKcezrpy8",
                "yasuo",
                "2013",
                "CHAMPION",
                List.of("hasagi")
        ));
        musics.add(new MusicDto(
                "LXsrbmoZ6pIjaBgwHxPw",
                "jinx",
                "2013",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "0pB9vX8axx4FRHrZV6Ll",
                "lucian",
                "2013",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "z5dtam7furwaFo3gXqZQ",
                "lissandra",
                "2013",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "S9GWnoWzKrJVWZCl8JZj",
                "zac",
                "2013",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "VgUsZAHZzYfrbWPYqqYi",
                "quinn",
                "2013",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "n7FniL9Bw07Joi5MchII",
                "thresh",
                "2013",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "BzvJBVDNqWwAOOsEwVvb",
                "vi",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "9sB2dfHtowOp97SUvYvO",
                "nami",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "EpJPxNlEkARgKN9yQqeu",
                "zed",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "CqpFIAPeGLgc8JkAt7EE",
                "elise",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "zZXfso7h8NbaeNTRiwqg",
                "kha'zix",
                "2012",
                "CHAMPION",
                List.of("khazix")
        ));
        musics.add(new MusicDto(
                "BIuva01Ej6vPhU38jqj8",
                "sindra",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "HJdmaXmQuuV8NyhJx9A4",
                "rengar",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "p6h0GwucOHLkbJSYSdHO",
                "diana",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "vk3mkh01NnKMFTx17GRj",
                "zyra",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "s5yEVyYi5L7qS0csaZfN",
                "jayce",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "uOdaHxTpofITpfQno5nU",
                "aatrox",
                "2013",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "dJoQlCWZgG5WSAj3Im2i",
                "draven",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "rtvVM4b8CL8JtUbwFqZ6",
                "darius",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "AvoZBKU2thNWJi11Z9bH",
                "varus",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "4hgVPJIEB5pvZTS1VaDN",
                "hecarim",
                "2012",
                "CHAMPION", List.of()
        ));
        musics.add(new MusicDto(
                "s3M8QP6TAdEtGlLNxGFu",
                "lulu",
                "2012",
                "CHAMPION", List.of()
        ));
    }
}
