<?php
    define("TITLE", "Home Page");
    include 'finalProject'; 
?>

<!DOCTYPE>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title><?php echo TITLE; ?></title>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="../CSS/reset.css">
        <link rel="stylesheet" type="text/css" href="../CSS/styles.css">
                
        <!-- file links -->
        <link href="Index.html">
        

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <header>
            <ul>
                <li class="headerMenu"><a href="../People/Miguel.php">Meet Miguel</a></li>
                <li class="headerMenu"><a href="../People/Josh.php">Meet Josh</a></li>
                <li class="headerMenu"><a href="../People/Cody.php">Meet Cody</a></li>
                <li class="headerMenu"><a href="../People/Ryan.php">Meet Ryan</a></li>
            </ul>
        </header>
        <main>
            <div class="mainDiv">
                <h3 class="mainDivH3">Maecenas nec egestas eros.</h3>
                <p class="mainDivP">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum et dictum libero. Mauris in auctor sem, sit amet ullamcorper erat. Aliquam id bibendum massa. Nullam ac pellentesque velit. Donec sed urna vel enim fringilla convallis. Sed eleifend pellentesque justo at ultricies. Sed commodo dui eu posuere dictum. Integer luctus purus leo, in mattis elit ultrices ut. Aliquam et mattis ipsum. Integer fermentum odio et ullamcorper pretium. Etiam aliquam, lacus sit amet vestibulum laoreet, urna sem mollis metus, ut sodales ligula quam eu ex. Nunc id risus maximus, tristique lorem nec, volutpat erat. Vivamus vel malesuada sapien. Suspendisse potenti. Nunc ex risus, porttitor at sem vel, cursus tincidunt urna. Nulla fermentum luctus egestas.

                Duis blandit auctor gravida. Integer in dui vitae metus feugiat mollis vitae non metus. Donec convallis, erat sit amet vestibulum pulvinar, metus neque fringilla tellus, a molestie metus libero nec quam. Curabitur ac massa metus. Praesent quis maximus mi, in laoreet diam. Donec tempus euismod neque nec venenatis. Nunc a mi tristique, porttitor lorem eu, consectetur odio. Proin elementum orci eget porta rutrum. Aenean et nisl non turpis scelerisque pretium ut sed mi. Fusce vulputate, orci ac convallis blandit, velit nisi vestibulum nisl, quis posuere ante nisl vel mauris. Nulla dignissim rhoncus consequat. Donec mollis dui non consequat tincidunt. Vivamus eu lobortis arcu, at luctus orci.</p>
            </div>
            <div class="mainDiv">
                <h3 class="mainDivH3">Ut ullamcorper ante et odio.</h3>
                <p class="mainDivP">Praesent tristique id eros sit amet sodales. Sed massa risus, gravida in libero egestas, pretium maximus ante. Aenean vel aliquam velit. Donec congue dictum eros non sagittis. Proin semper massa ac risus sagittis, eget hendrerit massa commodo. Aliquam et leo ex. Sed eget nunc at nisl varius tempus in eu lacus. Pellentesque placerat consectetur dolor nec egestas. Praesent vestibulum dolor at justo eleifend sollicitudin. Nunc id velit consequat, condimentum tortor at, volutpat sapien. Mauris nec nulla eu nisl blandit rhoncus eget ut mi. Vestibulum feugiat neque dui, finibus pellentesque nisi scelerisque in.</p>
            </div>
            <div class="mainDiv">
                <h3 class="mainDivH3">Nam non ligula ut ante.</h3>
                <p class="mainDivP">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque tempus, mi id elementum fermentum, nisi est interdum enim, non rhoncus ex sem a elit. Nullam ut placerat dolor. Cras ac ligula ac felis efficitur feugiat ut ut quam. Nullam gravida risus a elementum auctor. Suspendisse sed turpis at massa dapibus lacinia sit amet id ante. Phasellus congue ultricies ipsum sed facilisis. Etiam ipsum dui, mattis id libero eget, ultricies viverra tellus. Nunc hendrerit sodales ante, vitae suscipit risus ullamcorper id. Pellentesque in neque facilisis, tristique sapien nec, facilisis tortor. Donec vel arcu in ligula mollis lacinia sit amet eu nibh.

                Suspendisse vitae metus vel sem rhoncus faucibus eget sit amet est. Quisque quis nibh in neque elementum aliquet. Nunc elementum ante nunc, non feugiat mauris sodales a. Ut dictum viverra lorem dapibus hendrerit. Nunc vel ante non mi porta dictum. Cras tempor dictum dolor non tempor. Phasellus vitae lectus turpis.

                Pellentesque ullamcorper nisl at vulputate ullamcorper. Fusce in lorem ut erat ultrices lobortis id sit amet eros. Ut id condimentum nisl. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nunc aliquam urna nisl, in ultrices lorem ultricies sed. Quisque mi sapien, bibendum eu tellus a, condimentum rhoncus lectus. Aenean bibendum vehicula vulputate. Aenean molestie lectus id nisi fermentum, tempus euismod leo rutrum. Donec mattis molestie lorem, eu eleifend neque convallis ut. Mauris nisi tellus, lobortis vitae cursus ac, auctor non nibh. Vivamus justo justo, pharetra ac nunc sed, dictum vehicula dolor.</p>
            </div>
        </main>
        <footer>
            <div>
                <ul class="footerMenu">
                    <li class="footerMenu"><a href="../PHP/home.php">Home</a></li>
                    <li class="footerMenu"><a href="../PHP/contact.php">Contact</a></li>
                    <li class="footerMenu"><a href="../PHP/about.php">About</a></li>
                </ul>
            </div>
            <div>
                <ul class="subscribe">
                    <li class="subscribe"><a href="https://www.facebook.com/sharer/sharer.php?u=Final_Project_Whateva_Whateva" target="_blank">Share on Facebook</a></li>
                    <li class="subscribe"><a href="https://twitter.com/home?status=Final_Project_Whateva_Whateva" target="_blank">Share on Twitter</a></li>
                    <li class="subscribe"><a href="https://www.instagram.com/home?status=Final_Project_Whateva_Whatevan" target="_blank">Share on Instagram</a></li>
                    <li class="subscribe"><a href="https://www.snapchat.com/?status=Final_Project_Whateva_Whateva" target="_blank">Share on SnapChat</a></li>
                </ul>
            </div>
            <div class="copyright">
                <h6>Team whateva whateva &copy; 2019.</h6>
            </div>
        </footer>
    </body>
        <!-- jQuery -->
        <script src="//code.jquery.com/jquery-2.1.4.min.js"></script>
        
        <!-- Bootstrap JS -->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</html>