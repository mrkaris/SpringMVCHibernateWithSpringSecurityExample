$(document).ready(function(){
 $(".add").click(function(){
  toastr.success("The product added to cart");  

});
$(".myBox img").click(function(){
    toastr.error("You must click the add to car button")
});

$("#myForm").submit(function(e){
    e.preventDefault();
    $(this).css("opacity",0.4);
    $(this).html('<div class="spinner-border text-dark" role="status"><span class="sr-only">Loading...</span></div>');
    setTimeout(function(){

    $("#myForm").html("<img id='check' width='100' src=''/>");
    $("#myForm").append("<p class='text-center'> Το μηνυμα σας εστάλη με επιτυχία.<br> Θα επικοινωνήσουμε μαζί σας σύντομα</p>")
    },2000);
});

});