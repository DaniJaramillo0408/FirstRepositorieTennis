class PartidoTenis extends Terminal {
    public static void main(String[] args) {
        var jug1 = "";
        var jug2 = "";
        var jug3 = "";
        var jug4 = "";
        var jug5 = "";
        var jug6 = "";
        var jug7 = "";
        var jug8 = "";
        var resul = "";
        var win1 = "";
        var win2 = "";
        var win3 = "";
        var win4 = "";
        var winFin1 = "";
        var winFin2 = "";
        var winTournament = "";

        printLine("Ingrese la primera jugadora");
        jug1 = readLine();
        printLine("Ingrese la segunda jugadora");
        jug2 = readLine();
        printLine("Ingrese la tercera jugadora");
        jug3 = readLine();
        printLine("Ingrese la cuarta jugadora");
        jug4 = readLine();
        printLine("Ingrese la quinta jugadora");
        jug5 = readLine();
        printLine("Ingrese la sexta jugadora");
        jug6 = readLine();
        printLine("Ingrese la septima jugadora");
        jug7 = readLine();
        printLine("Ingrese la octava jugadora");
        jug8 = readLine();

        printLine("El primer partido es %s y %s", jug1, jug8);

        do {
            printLine("Ingrese el resultado");
            resul = readLine();

            if (resul.equals("2-0") || resul.equals("2-1")) {

                printLine("La ganadora es %s", jug1);
                win1 = jug1;

            } else if (resul.equals("0-2") || resul.equals("1-2")) {

                printLine("La ganadora es %s", jug8);
                win1 = jug8;

            } else {

                printLine("Error: resultado invalido");

            }
            printLine(win1);

        } while (win1 == "");

        printLine("El segundo partido es %s y %s", jug4, jug5);

        do {
            printLine("Ingrese el resultado");
            resul = readLine();

            if (resul.equals("2-0") || resul.equals("2-1")) {

                printLine("La ganadora es %s", jug4);
                win2 = jug4;

            } else if (resul.equals("0-2") || resul.equals("1-2")) {

                printLine("La ganadora es %s", jug5);
                win2 = jug5;

            } else

                printLine("Error: resultado invalido");

        } while (win2 == "");

        printLine("El tercer partido es %s y %s", jug6, jug3);

        do {
            printLine("Ingrese el resultado");
            resul = readLine();

            if (resul.equals("2-0") || resul.equals("2-1")) {

                printLine("La ganadora es %s", jug6);
                win3 = jug6;

            } else if (resul.equals("0-2") || resul.equals("1-2")) {

                printLine("La ganadora es %s", jug3);
                win3 = jug3;

            } else

                printLine("Error: resultado invalido");

        } while (win3 == "");

        printLine("El cuarto partido es %s y %s", jug7, jug2);

        do {
            printLine("Ingrese el resultado");
            resul = readLine();

            if (resul.equals("2-0") || resul.equals("2-1")) {

                printLine("La ganadora es %s", jug7);
                win4 = jug7;

            } else if (resul.equals("0-2") || resul.equals("1-2")) {

                printLine("La ganadora es %s", jug2);
                win4 = jug2;

            } else

                printLine("Error: resultado invalido");

        } while (win4 == "");

        printLine("El primer partido de la semifinal es %s y %s", win1, win2);

        do {
            printLine("Ingrese el resultado");
            resul = readLine();

            if (resul.equals("2-0") || resul.equals("2-1")) {

                printLine("La ganadora es %s", win1);
                winFin1 = win1;

            } else if (resul.equals("0-2") || resul.equals("1-2")) {

                printLine("La ganadora es %s", win2);
                winFin1 = win2;

            } else

                printLine("Error: resultado invalido");

        } while (winFin1 == "");

        printLine("El segundo partido de la semifinal es %s y %s", win3, win4);

        do {
            printLine("Ingrese el resultado");
            resul = readLine();

            if (resul.equals("2-0") || resul.equals("2-1")) {

                printLine("La ganadora es %s", win3);
                winFin2 = win3;

            } else if (resul.equals("0-2") || resul.equals("1-2")) {

                printLine("La ganadora es %s", win4);
                winFin2 = win4;

            } else

                printLine("Error: resultado invalido");

        } while (winFin2 == "");

        printLine("La Final es %s y %s", winFin1, winFin2);

        do {
            printLine("Ingrese el resultado");
            resul = readLine();

            if (resul.equals("2-0") || resul.equals("2-1")) {

                printLine("La ganadora del torneo es %s", winFin1);
                winTournament = winFin1;

            } else if (resul.equals("0-2") || resul.equals("1-2")) {

                printLine("La ganadora del torneo es %s", winFin2);
                winTournament = winFin2;

            } else

                printLine("Error: resultado invalido");

        } while (winTournament == "");

    }

}
