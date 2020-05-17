
	 var des = Object.getOwnPropertyDescriptor(HTMLInputElement.prototype, 'value');
	 Object.defineProperty(HTMLInputElement.prototype, 'value', { get: function() {
	   if(this.type === 'text' && this.list) {
	     var value = des.get.call(this);
	     var opt = [].find.call(this.list.options, function(option) {
	       return option.value === value;
	     });
	     return opt ? opt.dataset.value : value;
	   }
	 }});
