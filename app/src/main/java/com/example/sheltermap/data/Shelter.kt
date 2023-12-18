package com.example.sheltermap.data

import com.google.android.gms.maps.model.LatLng

data class Shelter(
    val address: String, val latLng: LatLng
)

val sh = listOf(
    Shelter(
        address = "Айвазовського?. 11", latLng = LatLng(49.813132449776205, 23.998370545605027)
    ),
    Shelter(
        address = "Айвазовського?. 22", latLng = LatLng(49.813131901120244, 23.997797936655385)
    ),
    Shelter(address = "Алмазна 19а", latLng = LatLng(49.85004263379889, 23.98296868938529)),
    Shelter(address = "Алмазна 21б", latLng = LatLng(49.849479177449815, 23.9842268168213)),
    Shelter(address = "Ангарна 18", latLng = LatLng(49.84167491768229, 23.97436315544526)),
    Shelter(
        address = "Антоненка-ДавидовичаБ. 1", latLng = LatLng(49.79250121028479, 24.06064715540032)
    ),
    Shelter(
        address = "Антоненка-ДавидовичаБ. 3",
        latLng = LatLng(49.793137921756035, 24.060575047454005)
    ),
    Shelter(
        address = "Антоненка-ДавидовичаБ. 7", latLng = LatLng(49.792963741233635, 24.06157980937392)
    ),
    Shelter(
        address = "Антоненка-ДавидовичаБ. 8а",
        latLng = LatLng(49.792143103847025, 24.064134740057796)
    ),
    Shelter(
        address = "Антоненка-ДавидовичаБ. 9", latLng = LatLng(49.79248972417151, 24.062077555400233)
    ),
    Shelter(address = "АнтоничаБ.?. 10", latLng = LatLng(49.78565304601196, 24.067671940051632)),
    Shelter(address = "АнтоничаБ.?. 12", latLng = LatLng(49.78555942133091, 24.068830824709437)),
    Shelter(address = "АнтоничаБ.?. 14", latLng = LatLng(49.78528433343117, 24.069575240051357)),
    Shelter(address = "АнтоничаБ.?. 16", latLng = LatLng(49.78505160073448, 24.068675670735654)),
    Shelter(address = "АнтоничаБ.?. 2", latLng = LatLng(49.787825201464734, 24.068083855395862)),
    Shelter(address = "АнтоничаБ.?. 20", latLng = LatLng(49.78425328102939, 24.067605540050597)),
    Shelter(address = "АнтоничаБ.?. 20а", latLng = LatLng(49.784311217660886, 24.068488032103755)),
    Shelter(address = "АнтоничаБ.?. 22", latLng = LatLng(49.78411769156136, 24.068678355392652)),
    Shelter(address = "АнтоничаБ.?. 24а", latLng = LatLng(49.78332592836559, 24.068280240049617)),
    Shelter(address = "АнтоничаБ.?. 28", latLng = LatLng(49.78317329009695, 24.066617494022747)),
    Shelter(address = "АнтоничаБ.?. 30", latLng = LatLng(49.78281885424102, 24.067682416760125)),
    Shelter(address = "АнтоничаБ.?. 32", latLng = LatLng(49.78250036845461, 24.066432570733205)),
    Shelter(address = "АнтоничаБ.?. 4", latLng = LatLng(49.78711457181394, 24.068330140053163)),
    Shelter(address = "АнтоничаБ.?. 7", latLng = LatLng(49.78621099702027, 24.069943186078866)),
    Shelter(address = "АнтоновичаВ. 10", latLng = LatLng(49.83487196813431, 24.006072886123384)),
    Shelter(address = "АнтоновичаВ. 11", latLng = LatLng(49.83461425147588, 24.00603205543869)),
    Shelter(address = "АнтоновичаВ. 115а", latLng = LatLng(49.827634554264435, 23.993319070774405)),
    Shelter(address = "АнтоновичаВ. 115в", latLng = LatLng(49.827496132938684, 23.993233240090003)),
    Shelter(address = "АнтоновичаВ. 121", latLng = LatLng(49.82637361966242, 23.991408494062476)),
    Shelter(address = "АнтоновичаВ. 13", latLng = LatLng(49.83467503414149, 24.00566419406983)),
    Shelter(address = "АнтоновичаВ. 15", latLng = LatLng(49.83443517288342, 24.005445178727587)),
    Shelter(address = "АнтоновичаВ. 19", latLng = LatLng(49.834315335623494, 24.005299455438426)),
    Shelter(address = "АнтоновичаВ. 20", latLng = LatLng(49.834532433014544, 24.00463226338541)),
    Shelter(address = "АнтоновичаВ. 22", latLng = LatLng(49.83436873498179, 24.004788132149493)),
    Shelter(address = "АнтоновичаВ. 29", latLng = LatLng(49.833821160552795, 24.004324286122415)),
    Shelter(address = "АнтоновичаВ. 30", latLng = LatLng(49.833956801842994, 24.00314078667381)),
    Shelter(address = "АнтоновичаВ. 38", latLng = LatLng(49.83357170691164, 24.002845986122107)),
    Shelter(address = "АнтоновичаВ. 58", latLng = LatLng(49.832166415625565, 24.00063629406772)),
    Shelter(address = "АнтоновичаВ. 62", latLng = LatLng(49.83203881693977, 24.00042355543645)),
    Shelter(address = "АнтоновичаВ. 72", latLng = LatLng(49.83122890774308, 23.99902887077785)),
    Shelter(address = "АнтоновичаВ. 8", latLng = LatLng(49.83500882728948, 24.00615234009686)),
    Shelter(address = "АнтоновичаВ. 9", latLng = LatLng(49.83462420980793, 24.006327270781014)),
    Shelter(address = "Аральська 10", latLng = LatLng(49.82705048348001, 24.053028701458484)),
    Shelter(address = "Аральська 17а", latLng = LatLng(49.827876297427814, 24.053136686116915)),
    Shelter(address = "Аральська 8", latLng = LatLng(49.82681538576663, 24.05261955385524)),
    Shelter(address = "Арсенальська 5", latLng = LatLng(49.84203719548197, 24.034900069210654)),
    Shelter(address = "Арсенальська 7", latLng = LatLng(49.84204659012276, 24.034782384552)),
    Shelter(address = "АрхипенкаО. 10", latLng = LatLng(49.8309581067181, 24.03547362317647)),
    Shelter(address = "АрхипенкаО. 11", latLng = LatLng(49.83045618199887, 24.0385608459059)),
    Shelter(address = "АрхипенкаО. 12", latLng = LatLng(49.83064050030779, 24.03558710783529)),
    Shelter(address = "АрхипенкаО. 14", latLng = LatLng(49.83092592444865, 24.035978869200157)),
    Shelter(address = "АрхипенкаО. 14", latLng = LatLng(49.83092592444865, 24.035978869200157)),
    Shelter(address = "АрхипенкаО. 22", latLng = LatLng(49.83070477610268, 24.03730707658842)),
    Shelter(address = "АрхипенкаО. 24", latLng = LatLng(49.8305570465896, 24.037089338517397)),
    Shelter(address = "АрхипенкаО. 3", latLng = LatLng(49.831172008361584, 24.035437807835653)),
    Shelter(address = "АрхипенкаО. 32", latLng = LatLng(49.830284067116864, 24.03814118454085)),
    Shelter(address = "АрхипенкаО. 4", latLng = LatLng(49.831003292802244, 24.035260676588894)),
    Shelter(address = "АрхипенкаО. 6", latLng = LatLng(49.83081926415666, 24.035025407835406)),
    Shelter(address = "АрхипенкаО. 8", latLng = LatLng(49.830987540923694, 24.035409569200247)),
    Shelter(address = "АрхипенкаО. 9", latLng = LatLng(49.83063159430345, 24.038006107834967)),
    Shelter(address = "Арх?текторська 3", latLng = LatLng(49.8357444190654, 24.012511507840024)),
    Shelter(address = "Арх?текторська 5", latLng = LatLng(49.8359859357767, 24.01249490784016)),
    Shelter(address = "Арх?текторська 7", latLng = LatLng(49.83616827440558, 24.012517023181626)),
    Shelter(address = "Баб?яО. 5", latLng = LatLng(49.82448940839044, 23.97827887714697)),
    Shelter(address = "Багряного?. 49", latLng = LatLng(49.82924574752363, 23.978085023174934)),
    Shelter(address = "Багряного?. 53", latLng = LatLng(49.82798251816306, 23.979951846467586)),
    Shelter(address = "Базарна 50", latLng = LatLng(49.85010854805163, 24.019098946488384)),
    Shelter(address = "БалабанаМ. 1", latLng = LatLng(49.84682241174055, 24.02357180785038)),
    Shelter(address = "БалабанаМ. 10", latLng = LatLng(49.84702296258809, 24.022749792509423)),
    Shelter(address = "БалабанаМ. 11", latLng = LatLng(49.84673699196584, 24.022381492509133)),
    Shelter(address = "БалабанаМ. 2", latLng = LatLng(49.84692311670903, 24.024035769215445)),
    Shelter(address = "БалабанаМ. 20", latLng = LatLng(49.84712658165156, 24.021733807850634)),
    Shelter(address = "БалабанаМ. 21", latLng = LatLng(49.84734990570226, 24.021599423192086)),
    Shelter(address = "БалабанаМ. 22", latLng = LatLng(49.84707301533636, 24.02154110785068)),
    Shelter(address = "БалабанаМ. 25", latLng = LatLng(49.846853417347226, 24.020717677168044)),
    Shelter(address = "БалабанаМ. 6", latLng = LatLng(49.8470618090002, 24.023479153874234)),
    Shelter(address = "БалабанаМ. 8", latLng = LatLng(49.847084335341144, 24.02302540785066)),
    Shelter(address = "Балт?йська 21", latLng = LatLng(49.81634446054593, 24.0038850385041)),
    Shelter(address = "БальзакаО. 25", latLng = LatLng(49.85499321820313, 24.01834228456417)),
    Shelter(address = "БальзакаО. 33", latLng = LatLng(49.85465374591463, 24.01866506922271)),
    Shelter(address = "БандериС. 15", latLng = LatLng(49.835065866026014, 24.015936630569136)),
    Shelter(address = "БандериС. 17", latLng = LatLng(49.8349567868843, 24.015556869204072)),
    Shelter(address = "БандериС. 19", latLng = LatLng(49.83503376637502, 24.015417899886597)),
    Shelter(address = "БандериС. 21", latLng = LatLng(49.83502774674333, 24.014970823180455)),
    Shelter(address = "БандериС. 23", latLng = LatLng(49.835049407123925, 24.0146954078392)),
    Shelter(address = "БандериС. 25", latLng = LatLng(49.83504722682796, 24.01448280783926)),
    Shelter(address = "БандериС. 35", latLng = LatLng(49.835025727086304, 24.012832538521664)),
    Shelter(address = "БандериС. 37", latLng = LatLng(49.83462809287432, 24.012606695983507)),
    Shelter(address = "БандериС. 43", latLng = LatLng(49.83088926487098, 23.994067008008646)),
    Shelter(address = "БандериС. 5", latLng = LatLng(49.84422667417792, 24.025481023325607)),
    Shelter(address = "БандериС. 51", latLng = LatLng(49.83531094056753, 24.010374803685288)),
    Shelter(address = "БандериС. 57", latLng = LatLng(49.83470743244492, 24.009125969002348)),
    Shelter(address = "БандериС. 5а", latLng = LatLng(49.83525225946579, 24.017472745235324)),
    Shelter(address = "БандериС. 6", latLng = LatLng(49.83526407243882, 24.019294549060813)),
    Shelter(address = "БандериС. 69", latLng = LatLng(49.83105216070245, 23.99339920675766)),
    Shelter(address = "БандериС. 7", latLng = LatLng(49.835256032832454, 24.01760344396338)),
    Shelter(address = "БандериС. 89", latLng = LatLng(49.830185604618514, 23.993518708077442)),
    Shelter(address = "Банк?вська 3", latLng = LatLng(49.84360900287075, 24.025639103405496)),
    Shelter(address = "Барв?нських 12", latLng = LatLng(49.84544691216864, 24.04181813831137)),
    Shelter(address = "Барв?нських 14", latLng = LatLng(49.81362150129417, 23.98311518131282)),
    Shelter(address = "Барв?нських 14", latLng = LatLng(49.84532680509189, 24.04188925365734)),
    Shelter(address = "Барв?нських 4", latLng = LatLng(49.83150655006772, 24.071448514537366)),
    Shelter(address = "Барв?нських 7", latLng = LatLng(49.8298309993118, 24.07419502514406)),
    Shelter(address = "БарончаС. 6", latLng = LatLng(49.87137324341252, 24.032319159826898)),
    Shelter(address = "БасарабО. 11", latLng = LatLng(49.8422703004427, 24.034538691730905)),
    Shelter(address = "БасарабО. 11а", latLng = LatLng(49.87236722800393, 24.04536994595217)),
    Shelter(address = "БасарабО. 9", latLng = LatLng(49.847693189246584, 24.024066830469124)),
    Shelter(address = "Баштанна 1", latLng = LatLng(49.84153569717323, 23.97713581745958)),
    Shelter(address = "Баштанна 3", latLng = LatLng(49.84148034460412, 23.97842327783663)),
    Shelter(address = "Бережанська 54", latLng = LatLng(49.80141139266137, 24.048358994125554)),
    Shelter(address = "Бережанська 54", latLng = LatLng(49.80141139266137, 24.048358994125554)),
    Shelter(address = "БериндиП. 1", latLng = LatLng(49.84336594737002, 24.02574715516686)),
    Shelter(address = "Б?беровича?. 11", latLng = LatLng(49.86618723579168, 23.964911953658937)),
    Shelter(address = "Б?беровича?. 13а", latLng = LatLng(49.86741544048442, 23.955012238313078)),
    Shelter(address = "Б?беровича?. 17", latLng = LatLng(49.867408525121114, 23.954990780640138)),
    Shelter(address = "Б?беровича?. 19", latLng = LatLng(49.867339371433744, 23.955044424822518)),
    Shelter(address = "Б?беровича?. 9", latLng = LatLng(49.86618723579168, 23.96490122482246)),
    Shelter(address = "Б?ласаВ. 3", latLng = LatLng(49.84489965627266, 24.022261462042763)),
    Shelter(address = "Б?линськогоМ. 23", latLng = LatLng(49.83202195883687, 24.018440961991)),
    Shelter(address = "Б?лоцерк?вська 1", latLng = LatLng(49.839646908742615, 24.01552264694635)),
    Shelter(address = "Б?лоцерк?вська 1а", latLng = LatLng(49.81796528573773, 24.053836109472773)),
    Shelter(address = "Б?лоцерк?вська 2а", latLng = LatLng(49.88143906262236, 24.07117423063958)),
    Shelter(
        address = "Б?чна_?нститутська 4а", latLng = LatLng(49.90236061000692, 24.08433676715234)
    ),
    Shelter(address = "Боберського?. 19", latLng = LatLng(49.82995361805165, 23.993500499693855)),
    Shelter(address = "Боберського?. 21-3", latLng = LatLng(49.82993869953938, 23.99351145365611)),
    Shelter(address = "Боберського?. 4", latLng = LatLng(49.83050571105866, 23.993876172472635)),
    Shelter(address = "БогомольцяО. 10", latLng = LatLng(49.833853212880754, 24.072793362876993)),
    Shelter(address = "БогомольцяО. 11а", latLng = LatLng(49.829848946324624, 24.070993225995572)),
    Shelter(address = "БогомольцяО. 15", latLng = LatLng(49.829513099554354, 24.07185151503009)),
    Shelter(address = "БогомольцяО. 2", latLng = LatLng(49.83028457147805, 24.07133651299578)),
    Shelter(address = "БогомольцяО.. 3", latLng = LatLng(49.83033628678908, 24.07167981787953)),
    Shelter(address = "БогомольцяО. 4", latLng = LatLng(49.830221905859005, 24.072023122763284)),
    Shelter(address = "БогомольцяО. 5", latLng = LatLng(49.8293412919767, 24.07214719307156)),
    Shelter(address = "БогомольцяО. 7", latLng = LatLng(49.83111852426564, 24.072427334598462)),
    Shelter(address = "БогомольцяО. 8", latLng = LatLng(49.83119983494658, 24.071478169998517)),
    Shelter(address = "Богуна?. 12", latLng = LatLng(49.83080577013258, 24.017877948938974)),
    Shelter(address = "Богуна?. 15", latLng = LatLng(49.83082440244575, 24.01776327246104)),
    Shelter(address = "Боднарська 16", latLng = LatLng(49.79844507954963, 24.047243275904624)),
    Shelter(address = "БодянськогоО. 1", latLng = LatLng(49.82898654717898, 24.071885097838436)),
    Shelter(address = "БодянськогоО. 20", latLng = LatLng(49.82900730976333, 24.07189582667491)),
    Shelter(address = "БодянськогоО. 22", latLng = LatLng(49.82903499319527, 24.071809995983113)),
    Shelter(address = "БодянськогоО. 24", latLng = LatLng(49.857927122852054, 24.06009419598532)),
    Shelter(
        address = "Бой-ЖеленськогоТ. 10", latLng = LatLng(49.830791779089516, 24.017836176423227)
    ),
    Shelter(address = "БойчукаМ. 10", latLng = LatLng(49.8052174783743, 24.000370080635292)),
    Shelter(address = "БойчукаМ. 45", latLng = LatLng(49.80626810126483, 24.000241075905596)),
    Shelter(address = "БойчукаМ. 5", latLng = LatLng(49.80604287874859, 24.0002410580117)),
    Shelter(address = "БойчукаМ. 8", latLng = LatLng(49.80609462148869, 24.000412701501414)),
    Shelter(address = "Болгарська 1", latLng = LatLng(49.82993059955215, 24.02377168249252)),
    Shelter(address = "Болгарська 3", latLng = LatLng(49.80923477140748, 23.98380848393997)),
    Shelter(address = "БортнянськогоД. 1", latLng = LatLng(49.84345093265744, 23.962169660932673)),
    Shelter(address = "БортнянськогоД. 17", latLng = LatLng(49.843273909121066, 23.96228402922204)),
    Shelter(address = "БортнянськогоД. 19", latLng = LatLng(49.8488343393904, 24.00210534055978)),
    Shelter(
        address = "БортнянськогоД. 20", latLng = LatLng(49.843367907069116, 23.962126745586772)
    ),
    Shelter(
        address = "БортнянськогоД. 20а", latLng = LatLng(49.841125249868576, 23.977962503754437)
    ),
    Shelter(address = "БортнянськогоД. 22", latLng = LatLng(49.84416181410503, 23.963198636447515)),
    Shelter(address = "БортнянськогоД. 25", latLng = LatLng(49.84347860782187, 23.962512983699888)),
    Shelter(address = "БортнянськогоД. 28", latLng = LatLng(49.846348983456174, 23.9949559968844)),
    Shelter(address = "БортнянськогоД. 34", latLng = LatLng(49.84378835472871, 23.962511923858724)),
    Shelter(address = "БортнянськогоД. 35", latLng = LatLng(49.84320185546472, 23.962126745586772)),
    Shelter(address = "БортнянськогоД. 36", latLng = LatLng(49.84586731138643, 24.00098908063846)),
    Shelter(address = "БортнянськогоД. 37", latLng = LatLng(49.84334160279191, 23.976483372449856)),
    Shelter(address = "БортнянськогоД. 38", latLng = LatLng(49.84582588533575, 24.00073530947489)),
    Shelter(address = "БортнянськогоД. 4", latLng = LatLng(49.843161798093014, 23.977077179366436)),
    Shelter(
        address = "БортнянськогоД. 40", latLng = LatLng(49.845764411577925, 24.000588640166768)
    ),
    Shelter(address = "БортнянськогоД. 41", latLng = LatLng(49.84633823116177, 23.962425123142893)),
    Shelter(address = "БортнянськогоД. 42", latLng = LatLng(49.84189566540188, 23.978389560299895)),
    Shelter(address = "БортнянськогоД. 43", latLng = LatLng(49.84334235166094, 23.96259881439288)),
    Shelter(address = "БортнянськогоД. 44", latLng = LatLng(49.84326898139791, 23.96256879368059)),
    Shelter(
        address = "БортнянськогоД. 48", latLng = LatLng(49.845590595776535, 23.973776183794058)
    ),
    Shelter(address = "БортнянськогоД. 5", latLng = LatLng(49.84370508104962, 23.96175986906232)),
    Shelter(address = "БортнянськогоД. 50", latLng = LatLng(49.87034543872525, 24.009563618657214)),
    Shelter(address = "БортнянськогоД. 55", latLng = LatLng(49.84561429687012, 23.998174694129023)),
    Shelter(address = "БортнянськогоД. 6", latLng = LatLng(49.84290868478772, 23.97679107734825)),
    Shelter(address = "БортнянськогоД. 7", latLng = LatLng(49.843312556597695, 23.96234132231628)),
    Shelter(address = "БортнянськогоД. 8", latLng = LatLng(49.843283968961, 23.962512979229864)),
    Shelter(address = "Ботк?наС. 73", latLng = LatLng(49.81340991614537, 23.99247641520748)),
    Shelter(
        address = "Брат?в М?хновських 15", latLng = LatLng(49.83954233965016, 24.003701753867208)
    ),
    Shelter(
        address = "Брат?в М?хновських 17", latLng = LatLng(49.839763892535814, 24.003588507843684)
    ),
    Shelter(
        address = "Брат?в М?хновських 18", latLng = LatLng(49.840519306729895, 24.003690107844474)
    ),
    Shelter(
        address = "Брат?в М?хновських 19", latLng = LatLng(49.83977632712273, 24.003719469208765)
    ),
    Shelter(
        address = "Брат?в М?хновських 2", latLng = LatLng(49.83829743897051, 24.00429870784247)
    ),
    Shelter(
        address = "Брат?в М?хновських 21", latLng = LatLng(49.84007793413301, 24.00337202318529)
    ),
    Shelter(
        address = "Брат?в М?хновських 22", latLng = LatLng(49.84065322009771, 24.004058999892045)
    ),
    Shelter(
        address = "Брат?в М?хновських 22а", latLng = LatLng(49.84088381066455, 24.00388057716226)
    ),
    Shelter(
        address = "Брат?в М?хновських 23", latLng = LatLng(49.84017877846475, 24.003307638526646)
    ),
    Shelter(
        address = "Брат?в М?хновських 24", latLng = LatLng(49.84092010271315, 24.003893596198044)
    ),
    Shelter(
        address = "Брат?в М?хновських 25", latLng = LatLng(49.84076705808704, 24.003349792503425)
    ),
    Shelter(
        address = "Брат?в М?хновських 26", latLng = LatLng(49.84157923140608, 24.003842523186492)
    ),
    Shelter(
        address = "Брат?в М?хновських 27а", latLng = LatLng(49.84059337466856, 24.003575384550683)
    ),
    Shelter(
        address = "Брат?в М?хновських 28", latLng = LatLng(49.841791498716205, 24.003913177163053)
    ),
    Shelter(
        address = "Брат?в М?хновських 3", latLng = LatLng(49.838728239038765, 24.00381409250144)
    ),
    Shelter(
        address = "Брат?в М?хновських 30", latLng = LatLng(49.84177926946765, 24.004234569210496)
    ),
    Shelter(
        address = "Брат?в М?хновських 31", latLng = LatLng(49.84154108947986, 24.003276207845566)
    ),
    Shelter(
        address = "Брат?в М?хновських 31а", latLng = LatLng(49.84151341320633, 24.00349078455168)
    ),
    Shelter(
        address = "Брат?в М?хновських 32", latLng = LatLng(49.84186701570332, 24.004033223186973)
    ),
    Shelter(
        address = "Брат?в М?хновських 32б", latLng = LatLng(49.84183933961634, 24.00416196921063)
    ),
    Shelter(
        address = "Брат?в М?хновських 33", latLng = LatLng(49.84183672166812, 24.003483123186815)
    ),
    Shelter(
        address = "Брат?в М?хновських 33а", latLng = LatLng(49.84239968628317, 24.003449084552354)
    ),
    Shelter(
        address = "Брат?в М?хновських 33б", latLng = LatLng(49.84220595547607, 24.00340616921112)
    ),
    Shelter(
        address = "Брат?в М?хновських 34", latLng = LatLng(49.84269813126117, 24.0034254618229)
    ),
    Shelter(
        address = "Брат?в М?хновських 35", latLng = LatLng(49.84279650958325, 24.00344439989386)
    ),
    Shelter(
        address = "Брат?в М?хновських 36", latLng = LatLng(49.84325655255822, 24.00355552318824)
    ),
    Shelter(
        address = "Брат?в М?хновських 37", latLng = LatLng(49.84347147462862, 24.002890107847236)
    ),
    Shelter(
        address = "Брат?в М?хновських 38", latLng = LatLng(49.843495149827035, 24.003176831141143)
    ),
    Shelter(
        address = "Брат?в М?хновських 39", latLng = LatLng(49.843843196403945, 24.002486923188748)
    ),
    Shelter(
        address = "Брат?в М?хновських 40а", latLng = LatLng(49.843459897611815, 24.00346073852982)
    ),
    Shelter(
        address = "Брат?в М?хновських 41", latLng = LatLng(49.84354634516767, 24.002997107847627)
    ),
    Shelter(
        address = "Брат?в М?хновських 45", latLng = LatLng(49.84453236263597, 24.00273524648323)
    ),
    Shelter(
        address = "Брат?в М?хновських 5", latLng = LatLng(49.83883135950821, 24.003754777160346)
    ),
    Shelter(
        address = "Брат?в М?хновських 50", latLng = LatLng(49.84413994219582, 24.003672469212923)
    ),
    Shelter(
        address = "Брат?в М?хновських 6", latLng = LatLng(49.838611380158326, 24.00403246181919)
    ),
    Shelter(
        address = "Брат?в М?хновських 7", latLng = LatLng(49.83878071317434, 24.003724792501725)
    ),
    Shelter(
        address = "Брат?в М?хновських 8", latLng = LatLng(49.83890059016801, 24.00420633852546)
    ),
    Shelter(
        address = "Брат?в М?хновських 8а", latLng = LatLng(49.83931287556389, 24.004374530573035)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 10", latLng = LatLng(49.84080037437188, 24.031873046479603)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 11", latLng = LatLng(49.840888287617204, 24.031979907844725)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 12", latLng = LatLng(49.840723367004294, 24.03210554647963)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 14", latLng = LatLng(49.84053187523169, 24.032497707844538)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 15", latLng = LatLng(49.840652843112814, 24.032201492503503)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 16", latLng = LatLng(49.84075543528269, 24.03271800784461)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 24", latLng = LatLng(49.840833218655675, 24.033907423186132)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 26", latLng = LatLng(49.84120676008777, 24.034214838527408)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 28", latLng = LatLng(49.841204229631906, 24.034695099892343)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 29", latLng = LatLng(49.84084194170613, 24.033072207844924)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 3", latLng = LatLng(49.84034554539879, 24.030692007844454)
    ),
    Shelter(
        address = "Брат?вРогатинц?в 30", latLng = LatLng(49.841151023078964, 24.03478695386875)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 32", latLng = LatLng(49.84123162224867, 24.035267215233738)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 37", latLng = LatLng(49.84122880612322, 24.03313331579772)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 39", latLng = LatLng(49.841101123593035, 24.03362113852748)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 4", latLng = LatLng(49.84047411605754, 24.031284192503136)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 41", latLng = LatLng(49.84121487592786, 24.033698423186294)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 43", latLng = LatLng(49.841466909805355, 24.033732692503907)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 45", latLng = LatLng(49.84122519219144, 24.03450056921011)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 47", latLng = LatLng(49.8413208446607, 24.034483307845278)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 49", latLng = LatLng(49.84157530156217, 24.03456320784537)
    ),
    Shelter(
        address = "Брат?в Рогатинц?в 5", latLng = LatLng(49.840479475711454, 24.03129503057423)
    ),
    Shelter(address = "Брат?в Рогатинц?в 7", latLng = LatLng(49.84057472901551, 24.0313667692094)),
    Shelter(address = "Брат?в Рогатинц?в 9", latLng = LatLng(49.8408391424192, 24.031855069209428)),
    Shelter(
        address = "Брат?в Тимошенк?в 2а", latLng = LatLng(49.83111342647101, 24.01777732317683)
    ),
    Shelter(
        address = "Брат?в Тимошенк?в 2б", latLng = LatLng(49.831168790908194, 24.01807773056537)
    ),
    Shelter(address = "БратунР. 3", latLng = LatLng(49.82901521332653, 24.0479476924925)),
    Shelter(address = "Брюховицька 33", latLng = LatLng(49.86498201984374, 23.96878487718495)),
    Shelter(address = "БуйкаП. 25", latLng = LatLng(49.81212060887357, 24.03255506918254)),
    Shelter(address = "Букова 8", latLng = LatLng(49.83493906740465, 24.079234953862894)),
    Shelter(address = "Вагилевича?. 1", latLng = LatLng(49.83392492128092, 24.04157989988545)),
    Shelter(address = "Вагилевича?. 2", latLng = LatLng(49.833888397889005, 24.04094239249701)),
    Shelter(address = "Вагилевича?. 3", latLng = LatLng(49.83366896229464, 24.041432099885306)),
    Shelter(address = "Вагилевича?. 4", latLng = LatLng(49.83373241848299, 24.04091548454423)),
    Shelter(address = "Вагилевича?. 5", latLng = LatLng(49.83330995425534, 24.041109323179125)),
    Shelter(address = "Вагилевича?. 6", latLng = LatLng(49.833494777443875, 24.040643477155523)),
    Shelter(address = "Вагилевича?. 7", latLng = LatLng(49.83345686472201, 24.04098250783782)),
    Shelter(address = "Вагилевича?. 8", latLng = LatLng(49.83340485931672, 24.040932630567635)),
    Shelter(address = "Вагилевича?. 9", latLng = LatLng(49.8331816425288, 24.040766207837642)),
    Shelter(address = "Вагонна 20", latLng = LatLng(49.82709427707037, 23.975973692490435)),
    Shelter(address = "Вагонна 7", latLng = LatLng(49.82704079874741, 23.97646917714941)),
    Shelter(address = "Валова 13", latLng = LatLng(49.82708951351841, 23.976339269196764)),
    Shelter(address = "Валова 14", latLng = LatLng(49.82746544865854, 23.975426223173365)),
    Shelter(address = "Валова 16", latLng = LatLng(49.827455387410815, 23.975687223173235)),
    Shelter(address = "Валова 19", latLng = LatLng(49.82613360705212, 23.977890323172172)),
    Shelter(address = "Валова 2", latLng = LatLng(49.82748524105671, 23.975823723173534)),
    Shelter(address = "Валова 23", latLng = LatLng(49.82613360705212, 23.977761577148506)),
    Shelter(address = "Валова 25", latLng = LatLng(49.82627843220002, 23.97798995385463)),
    Shelter(address = "Валова 27", latLng = LatLng(49.826050551727135, 23.977761577148506)),
    Shelter(address = "Валова 29", latLng = LatLng(49.82587979486684, 23.978274823171947)),
    Shelter(address = "Валова 3", latLng = LatLng(49.8433654261109, 24.02562489058101)),
    Shelter(address = "Валова 3", latLng = LatLng(49.83981563529268, 24.03116606529209)),
    Shelter(address = "Валова 3", latLng = LatLng(49.83980179666402, 24.031219709474474)),
    Shelter(address = "Валова 4", latLng = LatLng(49.84372440460258, 24.025372431983335)),
    Shelter(address = "Валова 5", latLng = LatLng(49.84328453882107, 24.02566255762784)),
    Shelter(address = "Варшавська 136", latLng = LatLng(49.85762313847834, 24.004260599757075)),
    Shelter(address = "Варшавська 35а", latLng = LatLng(49.860996463098836, 24.00930290595971)),
    Shelter(address = "Варшавська 56", latLng = LatLng(49.85944751828182, 24.010715753658413)),
    Shelter(address = "Варшавська 64", latLng = LatLng(49.85997471669706, 24.00953923831255)),
    Shelter(address = "Варшавська 68", latLng = LatLng(49.85996780026857, 24.009560695985492)),
    Shelter(
        address = "Васильк?вськогоС. 10", latLng = LatLng(49.829967407596506, 23.993526860165904)
    ),
    Shelter(
        address = "Васильк?вськогоС. 9", latLng = LatLng(49.830244007589265, 23.993441028468204)
    ),
    Shelter(address = "ВасильченкаС. 14", latLng = LatLng(49.856594160726125, 24.060434122966367)),
    Shelter(address = "ВахнянинаА. 27", latLng = LatLng(49.831567852048174, 24.072318845345595)),
    Shelter(address = "ВашингтонаДж. 11", latLng = LatLng(49.82930501801904, 24.071738068704445)),
    Shelter(address = "ВашингтонаДж. 13", latLng = LatLng(49.83040144894127, 24.07161189903255)),
    Shelter(address = "ВашингтонаДж. 13", latLng = LatLng(49.81705033605992, 24.070252324818597)),
    Shelter(address = "ВашингтонаДж. 15", latLng = LatLng(49.82989506843513, 24.071700459109724)),
    Shelter(address = "ВашингтонаДж. 17", latLng = LatLng(49.83022361327101, 24.071957933295604)),
    Shelter(address = "ВашингтонаДж. 21", latLng = LatLng(49.82958184992157, 24.07156640732084)),
    Shelter(address = "ВашингтонаДж. 4а", latLng = LatLng(49.81580247626622, 24.07061483830906)),
    Shelter(address = "ВашингтонаДж. 4б", latLng = LatLng(49.813722471174415, 24.06593501132774)),
    Shelter(address = "ВашингтонаДж. 4в", latLng = LatLng(49.815892471922055, 24.07066848249144)),
    Shelter(address = "ВашингтонаДж. 4д", latLng = LatLng(49.81430079187253, 24.065117209472476)),
    Shelter(address = "ВашингтонаДж. 5", latLng = LatLng(49.831168708361886, 24.071328159472205)),
    Shelter(address = "ВашингтонаДж. 5", latLng = LatLng(53.00359181559998, 23.772493538969492)),
    Shelter(address = "ВашингтонаДж. 6а", latLng = LatLng(49.81600433980077, 24.067700236453828)),
    Shelter(address = "ВашингтонаДж. 7а", latLng = LatLng(49.82984594670567, 24.071487257091338)),
    Shelter(address = "ВеделяА. 1", latLng = LatLng(49.80539868981448, 24.000500299381933)),
    Shelter(address = "ВеделяА. 10", latLng = LatLng(49.80559165540164, 24.000156972141667)),
    Shelter(address = "ВеделяА. 2", latLng = LatLng(49.80547995524374, 24.000371544398266)),
    Shelter(address = "ВеделяА. 3", latLng = LatLng(49.8057560108136, 24.000671947346852)),
    Shelter(address = "ВеделяА. 4", latLng = LatLng(49.80550582679058, 24.000328620106835)),
    Shelter(address = "ВеделяА. 5", latLng = LatLng(49.80575418547408, 24.000414446325745)),
    Shelter(address = "ВеделяА. 6", latLng = LatLng(49.80569787927827, 24.00024278046921)),
    Shelter(address = "ВеделяА. 7", latLng = LatLng(49.805392301079145, 24.00062901410949)),
    Shelter(address = "ВеделяА. 8", latLng = LatLng(49.81488366742612, 23.99921181878801)),
    Shelter(address = "ВеделяА. 9", latLng = LatLng(49.8054596892543, 24.00006888160976)),
    Shelter(address = "ВеличкаС. 8/10", latLng = LatLng(49.827943255611956, 23.956186510058703)),
    Shelter(
        address = "Величковського?. 10", latLng = LatLng(49.877877690647246, 23.934475867150383)
    ),
    Shelter(
        address = "Величковського?. 14", latLng = LatLng(49.87739186472996, 23.933799692122488)
    ),
    Shelter(
        address = "Величковського?. 16", latLng = LatLng(49.875768884106996, 23.935711538313768)
    ),
    Shelter(
        address = "Величковського?. 18", latLng = LatLng(49.875465756309886, 23.936323011332625)
    ),
    Shelter(address = "Величковського?. 1а", latLng = LatLng(49.87418732987895, 23.93207782482312)),
    Shelter(address = "Величковського?. 1б", latLng = LatLng(49.87504005744278, 23.93216292667845)),
    Shelter(
        address = "Величковського?. 2", latLng = LatLng(49.875614583888684, 23.937445724823153)
    ),
    Shelter(address = "Величковського?. 22", latLng = LatLng(49.87707160280391, 23.93348652582249)),
    Shelter(
        address = "Величковського?. 24", latLng = LatLng(49.877325108684346, 23.932393309477433)
    ),
    Shelter(address = "Величковського?. 26", latLng = LatLng(49.877744791085, 23.933166124823423)),
    Shelter(
        address = "Величковського?. 30", latLng = LatLng(49.87703771681725, 23.933240968348148)
    ),
    Shelter(
        address = "Величковського?. 30а", latLng = LatLng(49.8758154989748, 23.934632724823274)
    ),
    Shelter(
        address = "Величковського?. 34", latLng = LatLng(49.85201739655747, 24.022308982518105)
    ),
    Shelter(
        address = "Величковського?. 36", latLng = LatLng(49.876158339782066, 23.933389567150297)
    ),
    Shelter(
        address = "Величковського?. 40", latLng = LatLng(49.87688960283017, 23.933470856065572)
    ),
    Shelter(
        address = "Величковського?. 42", latLng = LatLng(49.87697165868927, 23.933814174365644)
    ),
    Shelter(
        address = "Величковського?. 48", latLng = LatLng(49.87619375495485, 23.931055911332674)
    ),
    Shelter(
        address = "Величковського?. 52", latLng = LatLng(49.87727636690418, 23.931532053659847)
    ),
    Shelter(
        address = "Величковського?. 56", latLng = LatLng(49.876963385154916, 23.933741935641187)
    ),
    Shelter(
        address = "Величковського?. 58а", latLng = LatLng(49.87561729923014, 23.931314153659606)
    ),
    Shelter(address = "Величковського?. 7", latLng = LatLng(49.88283143900087, 23.932763136055033)),
    Shelter(address = "Венец?ановаО. 10", latLng = LatLng(49.843875546505075, 24.025672847906684)),
    Shelter(address = "Венец?ановаО. 12", latLng = LatLng(49.843874634185156, 24.02554409739882)),
    Shelter(address = "Венец?ановаО. 13", latLng = LatLng(49.8439844214592, 24.025629923620322)),
    Shelter(address = "Венец?ановаО. 15", latLng = LatLng(49.84376210969412, 24.02562991915006)),
    Shelter(address = "Венец?ановаО. 9", latLng = LatLng(49.84368182161206, 24.025629932560783)),
    Shelter(address = "ВернадськогоВ. 10", latLng = LatLng(49.78498836045324, 24.060115565287806)),
    Shelter(address = "ВернадськогоВ. 12", latLng = LatLng(49.784916470371165, 24.060210124816063)),
    Shelter(address = "ВернадськогоВ. 14", latLng = LatLng(49.78498574198804, 24.060135022960743)),
    Shelter(address = "ВернадськогоВ. 16", latLng = LatLng(49.781463235612705, 24.072393911325246)),
    Shelter(address = "ВернадськогоВ. 18", latLng = LatLng(49.78502203203207, 24.060138289256784)),
    Shelter(address = "ВернадськогоВ. 2", latLng = LatLng(49.78144245262704, 24.0723724536523)),
    Shelter(address = "ВернадськогоВ. 20", latLng = LatLng(49.781641464133365, 24.072240416801023)),
    Shelter(address = "ВернадськогоВ. 24", latLng = LatLng(49.78503588633318, 24.06022411994859)),
    Shelter(address = "ВернадськогоВ. 26", latLng = LatLng(49.7851051577793, 24.06030995064039)),
    Shelter(address = "ВернадськогоВ. 32", latLng = LatLng(49.78168302992513, 24.072326247492832)),
    Shelter(address = "ВернадськогоВ. 4", latLng = LatLng(49.7814986937417, 24.072669211328773)),
    Shelter(address = "ВернадськогоВ. 42", latLng = LatLng(49.78156797024558, 24.07243317692631)),
    Shelter(address = "ВернадськогоВ. 8", latLng = LatLng(49.78144699724834, 24.064408953652222)),
    Shelter(address = "Вернигори 10", latLng = LatLng(49.843616983406335, 23.96234132231628)),
    Shelter(address = "Вернигори 21", latLng = LatLng(49.84309024169733, 23.962384233192232)),
    Shelter(address = "Вернигори 22", latLng = LatLng(49.84353650580035, 23.962559649109796)),
    Shelter(address = "Вернигори 24", latLng = LatLng(49.8433418671712, 23.962559644639853)),
    Shelter(address = "Вернигори 26", latLng = LatLng(49.840988502560556, 23.977665841927355)),
    Shelter(address = "Вернигори 27", latLng = LatLng(49.843312367172594, 23.96255963570016)),
    Shelter(address = "Вернигори 28", latLng = LatLng(49.84126344275381, 23.96912567915318)),
    Shelter(address = "Вернигори 30", latLng = LatLng(49.84325519187742, 23.962516711414345)),
    Shelter(address = "Вернигори 32", latLng = LatLng(49.84336498050986, 23.962387960906586)),
    Shelter(address = "Вернигори 8", latLng = LatLng(49.84026576033114, 24.006550554613685)),
    Shelter(address = "Верхратського?. 10", latLng = LatLng(49.83865868581343, 24.042488027625513)),
    Shelter(
        address = "Верхратського?. 11", latLng = LatLng(49.838776316811746, 24.042370010437015)
    ),
    Shelter(address = "Верхратського?. 11а", latLng = LatLng(49.83938096209305, 24.03758462941823)),
    Shelter(
        address = "Верхратського?. 12", latLng = LatLng(49.838748638955515, 24.042445112284238)
    ),
    Shelter(address = "Верхратського?. 15", latLng = LatLng(49.83874171948901, 24.042402196942962)),
    Shelter(address = "Верхратського?. 3", latLng = LatLng(49.838779491435126, 24.042528895377465)),
    Shelter(address = "Верхратського?. 4", latLng = LatLng(49.83871404161299, 24.042412925778283)),
    Shelter(address = "Верхратського?. 5", latLng = LatLng(49.83876247788561, 24.042445112284238)),
    Shelter(address = "Верхратського?. 6", latLng = LatLng(49.838537187601496, 24.043791525214825)),
    Shelter(address = "Верхратського?. 7", latLng = LatLng(49.83876939734918, 24.042412925778283)),
    Shelter(address = "Верхратського?. 8", latLng = LatLng(49.83874171948901, 24.042348552766374)),
    Shelter(address = "Верхратського?. 9", latLng = LatLng(49.83875555842107, 24.042348552766374)),
    Shelter(address = "Верхратського?. 9", latLng = LatLng(49.83875555842107, 24.042348552766374)),
    Shelter(address = "Весела 1", latLng = LatLng(49.846359084037005, 24.027017281602145)),
    Shelter(address = "Весела 4", latLng = LatLng(49.84743441790225, 24.0276257257787)),
    Shelter(address = "Весела 5", latLng = LatLng(49.8467557564274, 24.026972896943434)),
    Shelter(address = "Весела 7", latLng = LatLng(49.84691727426035, 24.02694439694334)),
    Shelter(address = "Весела 13", latLng = LatLng(49.846951565733995, 24.026925952766813)),
    Shelter(address = "Ветеран?в 3", latLng = LatLng(49.84994932166683, 24.019924668108217)),
    Shelter(address = "Ветеран?в 5", latLng = LatLng(49.85004938226961, 24.019655668108243)),
    Shelter(address = "Ветеран?в 6", latLng = LatLng(49.85030118144077, 24.01942088344954)),
    Shelter(address = "Виг?н 1", latLng = LatLng(49.816252257267486, 24.05849036810651)),
    Shelter(address = "Виг?н 3", latLng = LatLng(49.81566768147472, 24.05773625276519)),
    Shelter(address = "Виговського?. 1", latLng = LatLng(49.83036830567233, 23.968642268107278)),
    Shelter(address = "Виговського?. 11", latLng = LatLng(49.827869276316164, 23.968936096942333)),
    Shelter(address = "Виговського?. 13", latLng = LatLng(49.82763239281571, 23.968322439271763)),
    Shelter(address = "Виговського?. 13а", latLng = LatLng(49.827221588327255, 23.969404954613005)),
    Shelter(address = "Виговського?. 17", latLng = LatLng(49.826420932537204, 23.968738868107003)),
    Shelter(address = "Виговського?. 21", latLng = LatLng(49.82540872057371, 23.968102354612885)),
    Shelter(address = "Виговського?. 23", latLng = LatLng(49.82495725755385, 23.96849949694229)),
    Shelter(address = "Виговського?. 25", latLng = LatLng(49.82453893711445, 23.967949468106916)),
    Shelter(address = "Виговського?. 25а", latLng = LatLng(49.82445659426093, 23.969110510436263)),
    Shelter(address = "Виговського?. 27", latLng = LatLng(49.82400974637309, 23.96869609694216)),
    Shelter(address = "Виговського?. 29", latLng = LatLng(49.82305639284206, 23.96777612393025)),
    Shelter(address = "Виговського?. 3", latLng = LatLng(49.829823703501354, 23.968584354613135)),
    Shelter(address = "Виговського?. 31", latLng = LatLng(49.82198007769553, 23.969058181600786)),
    Shelter(address = "Виговського?. 31", latLng = LatLng(49.82198007769553, 23.969058181600786)),
    Shelter(address = "Виговського?. 31а", latLng = LatLng(49.82179856568803, 23.968508896942105)),
    Shelter(address = "Виговського?. 33", latLng = LatLng(49.82226162081162, 23.96983465461273)),
    Shelter(address = "Виговського?. 35", latLng = LatLng(49.82259990721548, 23.971102196942176)),
    Shelter(address = "Виговського?. 37", latLng = LatLng(49.822974506143716, 23.971809996942074)),
    Shelter(address = "Виговського?. 39", latLng = LatLng(49.82077111244805, 23.969576468106677)),
    Shelter(address = "Виговського?. 3а", latLng = LatLng(49.82993524473407, 23.969717781601286)),
    Shelter(address = "Виговського?. 41", latLng = LatLng(49.81984828166342, 23.97031639694196)),
    Shelter(address = "Виговського?. 45", latLng = LatLng(49.81850779654219, 23.971247769953784)),
    Shelter(address = "Виговського?. 45а", latLng = LatLng(49.81769838850861, 23.971874642329364)),
    Shelter(address = "Виговського?. 47", latLng = LatLng(49.81690819133705, 23.97279816810652)),
    Shelter(address = "Виговського?. 49", latLng = LatLng(49.8161106121699, 23.973542281600487)),
    Shelter(address = "Виговського?. 5", latLng = LatLng(49.82922298826422, 23.968401210436614)),
    Shelter(address = "Виговського?. 51", latLng = LatLng(49.81602908054414, 23.974524368106426)),
    Shelter(address = "Виговського?. 53", latLng = LatLng(49.81620980278813, 23.97511695461246)),
    Shelter(address = "Виговського?. 55", latLng = LatLng(49.81540619086105, 23.97471663927105)),
    Shelter(address = "Виговського?. 57", latLng = LatLng(49.81569064092094, 23.975408839271168)),
    Shelter(address = "Виговського?. 59", latLng = LatLng(49.81628962526994, 23.97636248160047)),
    Shelter(address = "Виговського?. 5а", latLng = LatLng(49.829199946627696, 23.969635696942433)),
    Shelter(address = "Виговського?. 5б", latLng = LatLng(49.829418250172886, 23.9701786816012)),
    Shelter(address = "Виговського?. 63", latLng = LatLng(49.816980210303996, 23.976329112283043)),
    Shelter(address = "Виговського?. 65", latLng = LatLng(49.816658733635826, 23.977269110435834)),
    Shelter(address = "Виговського?. 67", latLng = LatLng(49.814913706310755, 23.978398196941686)),
    Shelter(address = "Виговського?. 69", latLng = LatLng(49.81422397717121, 23.978074766259137)),
    Shelter(address = "Виговського?. 7", latLng = LatLng(49.828799947657785, 23.96911893927174)),
    Shelter(address = "Виговського?. 71", latLng = LatLng(49.81422926218677, 23.979148825777006)),
    Shelter(address = "Виговського?. 72", latLng = LatLng(49.822456898551955, 23.966655968106714)),
    Shelter(address = "Виговського?. 73", latLng = LatLng(49.814339130850215, 23.979858810435772)),
    Shelter(address = "Виговського?. 77", latLng = LatLng(49.813444133410584, 23.978927539270963)),
    Shelter(address = "Виговського?. 79", latLng = LatLng(49.813636286705204, 23.979941796941635)),
    Shelter(address = "Виговського?. 81", latLng = LatLng(49.81318801844085, 23.97995949694155)),
    Shelter(address = "Виговського?. 83", latLng = LatLng(49.81287028143134, 23.98128601228285)),
    Shelter(address = "Виговського?. 85", latLng = LatLng(49.81360075604708, 23.98104643927103)),
    Shelter(address = "Виговського?. 87", latLng = LatLng(49.81363070979768, 23.981544496941584)),
    Shelter(address = "Виговського?. 89", latLng = LatLng(49.81302771878468, 23.982257254612282)),
    Shelter(address = "Виговського?. 9", latLng = LatLng(49.828368390709706, 23.968379525777735)),
    Shelter(address = "Виговського?. 9а", latLng = LatLng(49.82835540686243, 23.96955899694236)),
    Shelter(address = "Вигоди 10", latLng = LatLng(49.843791984100115, 23.972559954613875)),
    Shelter(address = "Вигоди 21", latLng = LatLng(49.841317858072735, 23.97363482577844)),
    Shelter(address = "Вигоди 36", latLng = LatLng(49.841317091891966, 23.972882625778354)),
    Shelter(address = "Вигоди 44", latLng = LatLng(49.84059935182482, 23.973104581601735)),
    Shelter(address = "Вигоди 52", latLng = LatLng(49.839055321244835, 23.972998768107644)),
    Shelter(address = "Вигоди 54", latLng = LatLng(49.83883989969075, 23.973807198790162)),
    Shelter(address = "Вигоди 56", latLng = LatLng(49.83838750111492, 23.973819481601655)),
    Shelter(address = "Вигоди 58", latLng = LatLng(49.838593780956, 23.972438283448945)),
    Shelter(address = "Вигоди 58", latLng = LatLng(49.838593780956, 23.972438283448945)),
    Shelter(address = "Вигоди 60", latLng = LatLng(49.838078343341266, 23.972739539272304)),
    Shelter(address = "Вигоди 62", latLng = LatLng(49.83786056354596, 23.97417309694294)),
    Shelter(address = "ВинниченкаВ. 2", latLng = LatLng(49.842489176205504, 24.035719324212955)),
    Shelter(address = "ВинниченкаВ. 26", latLng = LatLng(49.843923202434794, 24.036344668107905)),
    Shelter(address = "ВинниченкаВ. 28", latLng = LatLng(49.844065501966455, 24.03646902762582)),
    Shelter(address = "ВинниченкаВ. 4", latLng = LatLng(49.83916244327818, 24.035773983449)),
)